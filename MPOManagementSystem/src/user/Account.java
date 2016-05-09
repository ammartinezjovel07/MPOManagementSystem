package user;
import database.DatabaseHandler;
import java.util.LinkedHashMap;

public class Account
{
	LinkedHashMap <String, Object> accountElements = new LinkedHashMap <String, Object>();

	public Account ()
	{

	}
	
	public Account (String firstName, char middleInitial,String lastName, String organizationName,
			String departmentName, String positionTitle, String departmentContactName, String workContactName,
			String email, String username, String password, String userType, boolean isApproved)
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
		accountElements.put("userType", userType);
		accountElements.put("isApproved", isApproved);
	}
	
	public boolean createAccount(String firstName, char middleInitial,String lastName,String organizationName,
			String departmentName, String positionTitle, String departmentContactName, String workContactName,
			String email, String username, String password, String userType, boolean isApproved)
	{
		Account newAccount = new Account(firstName,middleInitial,lastName, organizationName,
				departmentName,positionTitle,departmentContactName, workContactName,
				email, username, password,userType, isApproved);
		DatabaseHandler db = new DatabaseHandler();
		return db.createUser(newAccount);
	}
	
	public boolean deleteAccount(String username)
	{
		DatabaseHandler db = new DatabaseHandler();
		return db.deleteUser(username);
	}

	public boolean updateAccount(String username, String field, String value)
	{
		DatabaseHandler db = new DatabaseHandler();
		return db.updateUser(username, field, value);
	}
	
	public boolean approveAccount(String username)
	{
		DatabaseHandler db = new DatabaseHandler();
		return db.approveUserAccount(username);
	}
	
	public boolean verifyCredentials(String username, String password)
	{
		DatabaseHandler db = new DatabaseHandler();
		return db.verifyCredentials(username,password);
	}

//	public String provideUserAccount(String email, String username)
//	{
//		String userType = DatabaseHandler.provideUserType(email, username);
//		return userType;
//	}
//		
	public LinkedHashMap<String, Object> getAccountElements() {
		return accountElements;
	}

	public void setAccountElements(LinkedHashMap<String, Object> accountElements) {
		this.accountElements = accountElements;
	}

}