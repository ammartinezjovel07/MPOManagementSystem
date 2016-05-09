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
	public Project[] viewTIPReport(int year)
	{		
		Report report = new Report();
		return report.generateTipReport(year);

	}
	
	public Project[] viewMTPReport(int year)
	{		
		Report report = new Report();
		return report.generateTipReport(year);
	}
	
	public Report generateReport(String reportType, int year)
	{

		return null;
	}
	
}
