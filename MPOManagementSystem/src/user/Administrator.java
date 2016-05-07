package user;

public class Administrator extends AuthenticatedUser
{
	public Administrator()
	{
		
	}
	
	public boolean createAccount(String firstName, char middleInitial,String lastName, String organizationName,
			String departmentName, String positionTitle, String departmentContactName, String workContactName,
			String email, String username, String password, String reenteredPassword, String userType, boolean isApproved)
	{
		Account thisAccount = new Account();
		return thisAccount.createAccount(firstName, middleInitial, lastName, organizationName, departmentName, positionTitle, 
				departmentContactName, workContactName, email, username, password, reenteredPassword, userType, isApproved);
	}
	
	public boolean deleteAccount(String username)
	{
		Account thisAccount = new Account();
		return thisAccount.deleteAccount(username);
	}
	
	public boolean updateAccount(String username, String field, String value)
	{
		Account thisAccount = new Account();
		return thisAccount.updateAccount(username, field, value);
	}
	
}
