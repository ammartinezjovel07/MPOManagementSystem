package user;
import database.DatabaseHandler;
import java.util.HashMap;

public class Account
{
	HashMap <String, Object> accountElements = new HashMap <String, Object>();

	public Account ()
	{

	}
	
	public Account (String firstName, char middleInitial,String lastName, String organizationName,
			String departmentName, String positionTitle, String departmentContactName, String workContactName,
			String email, String username, String password, String reenteredPassword, String userType, boolean isApproved)
	{
		accountElements.put("firstName", firstName);
		accountElements.put("middleInitial", middleInitial);
		accountElements.put("lastName", lastName);
		accountElements.put("organizationName", organizationName);
		accountElements.put("departmentName", departmentName);
		accountElements.put("positionTitle", positionTitle);
		accountElements.put("departmentContactName", departmentContactName);
		accountElements.put("workContactName", workContactName);
		accountElements.put("email", email);
		accountElements.put("username", username);
		accountElements.put("password", password);
		accountElements.put("reenteredPassword", reenteredPassword);
		accountElements.put("userType", userType);
		accountElements.put("isApproved", isApproved);
	}
	
	public boolean createAccount(String firstName, char middleInitial,String lastName, String organizationName,
			String departmentName, String positionTitle, String departmentContactName, String workContactName,
			String email, String username, String password, String reenteredPassword, String userType, boolean isApproved)
	{
		Account newAccount = new Account(firstName,middleInitial,lastName,organizationName,
				departmentName,positionTitle,departmentContactName, workContactName,
				email, username, password,reenteredPassword,userType, isApproved);
		return DatabaseHandler.createUser(newAccount.getAccountElements());
	}
	
	public boolean deleteAccount(String username)
	{
		return DatabaseHandler.deleteUser(username);
	}

	public boolean updateAccount(String username, String field, String value)
	{
		return DatabaseHandler.updateUser(username, field, value);
	}
	
	public String provideUserAccount(String email, String username)
	{
		String userType = DatabaseHandler.provideUserType(email, username);
		return userType;
	}
	
	public boolean verifyCredentials(String username, String password)
	{
		return DatabaseHandler.verifyCredentials(username,password);
	}
	
	public boolean approveAccount(String username)
	{
		return DatabaseHandler.approveAccount(username, "isApproved", true);
	}

	public HashMap<String, Object> getAccountElements() {
		return accountElements;
	}

	public void setAccountElements(HashMap<String, Object> accountElements) {
		this.accountElements = accountElements;
	}

}