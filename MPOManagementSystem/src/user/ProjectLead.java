package user;
import database.DatabaseHandler;
import project.ProposedProject;

public class ProjectLead extends AuthenticatedUser
{

	public ProjectLead()
	{
		
	}
	
	public boolean createProjectTest(String one, String two, String three)
	{
		DatabaseHandler db = new DatabaseHandler();
		return db.createProjectTest(one,two, three);
	}
//	public boolean createProjectSubmission()
//	{
//		
//	}
	
//	public boolean updateProjectSubmission()
//	{
//		
//	}
	
//	public boolean deleteProjectSubmission()
//	{
//		
//	}
	
//	public boolean manageProject()
//	{
//		ProjectManager pm = new ProjectManager();
//		pm.manageProposedProject();
//		
//	}
}
