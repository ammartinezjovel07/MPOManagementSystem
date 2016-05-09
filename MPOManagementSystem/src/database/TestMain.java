package database;
import user.*;


public class TestMain {

	
	public static void main(String args[])
	{
	
		Administrator admin = new Administrator();
		//admin.createAccount("luis", 'c', "luis", "luis", "luis", "luis", "luis", "luis", "luis", "luis", "luis", "luis", true);
		//admin.deleteAccount("luis");
		//admin.updateAccount("luis", "email", "here");
		
		MPOLeadUser mpoLead = new MPOLeadUser();
		//mpoLead.approveAccount("luis");
		
		RegularUser ruser = new RegularUser();
		ruser.verifyCredentials("luis", "luis");
	}
}
