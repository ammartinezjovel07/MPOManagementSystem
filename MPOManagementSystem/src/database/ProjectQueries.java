package database;

import java.util.Map;

public class ProjectQueries {

	public  String createProjectQueries(Map<String, String> projectInfo){return null;}
	public String retriveProjectQueries(int id){return null;}
	public String updateProjectQueries(Map<String, String> projectInfo, int id){return null;}
	public String deleteProjectQueries(int id){return null;}

	public static String createProjectTest(String one, String two, String three)
	{
		String query = "Insert into projectsTest values("+"\""+one+"\""+"\""+two+"\""+"\""+three+"\");";
		System.out.println(query);
		return query;
	}
}
