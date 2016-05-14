package user;

public class MPOLeadUser extends MPOStaff
{
	public MPOLeadUser()
	{
		
	}
	
	public boolean approveAccount(String username)
	{
		Account thisAccount = new Account();
		return thisAccount.approveAccount(username);
	}
	
}
