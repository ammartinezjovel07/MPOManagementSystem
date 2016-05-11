package user;
import java.util.ArrayList;

import database.DatabaseHandler;
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
	
//	
//	
//	public ArrayList<database.Project> viewTIPReport(int year)
//	{		
//		Report report = new Report();
//		return report.generateTIPReport(year);	
//	}
//	
//	public ArrayList<database.Project> viewMTPReport(int year)
//	{		
//		Report report = new Report();
//		return report.generateMTPReport(year);	
//	}
	
	
//	public Report generateReport()
//	{
//		
//	}
	
}
