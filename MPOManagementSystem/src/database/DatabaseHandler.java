package database;

import java.sql.Connection;
import project.*;
import user.*;
import java.util.*;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class DatabaseHandler {

	protected  String db_name = "jdbc:mysql://earth.cs.utep.edu/cs4311team1sp16";
	protected  String username="cs4311team1sp16";
	protected  String password="cs4311!cs4311team1sp16";
	
	
	protected boolean res = false;
	
	public ArrayList<Project> retrieveTIP(int year)
	{
		List result = null;
		ReportQueries rq = new ReportQueries();
		String query = rq.getTipQuery(year);
		try {
			result = connect(query);
		} catch (SQLException e) {
			System.out.printf("error");
		}
		
		//needs implementation
		return listToProject(result);
	}
	
	public ArrayList<Project> retrieveMTP(){return null;}
	
	public boolean createUser(Account account)
	{
		String query = UserQueries.createUserQueries(account.getAccountElements());
		
		return false;
	}
	
	
	public Map retrieveUser(String username, String email){return null;}
	public boolean updateUser(Map<String, Object> userInfo, String usesrname, String email){return false;}
	public boolean deleteUser(String username, String email){return false;}
	
	public boolean createProject(Map<String, Object> projectInfo){return false;}
	public Map retrieveProject(int id){return null;}
	public boolean updateProject(Map<String, Object> projectInfo, String username, String email){return false;}
	public boolean deleteProject(String username, String email){return false;}
	
	private Map toMap(ResultSet rs){return null;}
	
	private List connect(String query) throws SQLException{
	Connection conn = null;
	PreparedStatement  stmt = null;
	ResultSet result = null;
	List listResult = null;
	
	try{
		//establish connection
		conn = DriverManager.getConnection(db_name, username, password);
		
		//ready the prepared statement and set ? values for the query
		stmt = conn.prepareStatement(query);
		//stmt.setInt(1,1);
		//stmt.setString(2,"test");
		
		//execute the query
		result = stmt.executeQuery();
		
		//convert to Map
		listResult = resultSetToArrayList(result);
	}
	catch(Exception e){e.printStackTrace(System.out);}
	
	finally
	{
		if(result != null)
			result.close();
		if(stmt != null)
			stmt.close();
		if(conn != null)
			conn.close();

	}
	return listResult;
}
	//stack overflow http://stackoverflow.com/questions/7507121/efficient-way-to-handle-resultset-in-java
	public List resultSetToArrayList(ResultSet rs) throws SQLException{
		  ResultSetMetaData md = rs.getMetaData();
		  int columns = md.getColumnCount();
		  ArrayList list = new ArrayList(50);
		  while (rs.next()){
		     HashMap row = new HashMap(columns);
		     for(int i=1; i<=columns; ++i){           
		      row.put(md.getColumnName(i),rs.getObject(i));
		     }
		      list.add(row);
		  }

		 return list;
		}
	
	public ArrayList<Project> listToProject(List list)
	{
		ArrayList<Project> result = new ArrayList<Project>();
		for (int i = 0; i < list.size();  i++){
		HashMap mp = (HashMap) list.get(i);

		Project p = new Project((String)mp.get("name"), (String)mp.get("city"), (int)mp.get("year"));
	
		result.add(p);
		}
		
		return result;
	}
	

	
}
