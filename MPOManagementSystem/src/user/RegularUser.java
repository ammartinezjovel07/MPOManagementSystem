package user;
import project.Project;
import report.Report;

public class RegularUser
{
	public RegularUser()
	{
		
	}
	
	public Account verifyCredentials(String username, String password)
	{
		Account thisAccount = new Account();
		return thisAccount.verifyCredentials(username, password);
	}
//	
//	public Project[] viewProjects()
//	{
//		return null;		
//	}
//	
//	public Project[] viewReport()
//	{		
//		return null;
//	}
	
//	public Report generateReport()
//	{
//		
//	}
	
}
