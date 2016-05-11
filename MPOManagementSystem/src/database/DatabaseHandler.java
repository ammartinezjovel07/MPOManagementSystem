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
import java.sql.Statement;

public class DatabaseHandler {

	protected  String db_name = "jdbc:mysql://earth.cs.utep.edu/cs4311team1sp16";
	protected  String db_username="cs4311team1sp16";
	protected  String db_password="cs4311!cs4311team1sp16";
	protected boolean res = false;

	//User queries
	public boolean createUser(Account account)
	{
		String query = UserQueries.createUserQueries(account.getAccountElements());
		return checkAffectedRows(query);
	}

	public boolean deleteUser(String accountEmail)
	{
		String query = UserQueries.deleteUserQueries(accountEmail);
		return checkAffectedRows(query);
	}

	public boolean updateUser(String username, String field, String value)
	{	
		String query = UserQueries.updateUserQueries(username, field, value);
		return checkAffectedRows(query);
	}

	public boolean approveUserAccount(String username)
	{
		String query = UserQueries.approveUserAccountQueries(username);
		return checkAffectedRows(query);

	}

	public boolean verifyCredentials(String username, String password)
	{
		String query = UserQueries.verifyCredentials(username);
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		String passwordRetrieved = "";
		try {
			conn = DriverManager.getConnection(db_name, db_username, db_password);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);
			
			while(rs.next())
			{
				passwordRetrieved = rs.getString("password");
				//System.out.println("password: "+passwordRetrieved);
			}
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(passwordRetrieved.equals(password))
			return true;
		return false;
	}

	public Account retrieveAccount(String username)
	{
		String query = UserQueries.retrieveAccountInfo(username);
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet resultSet = null;

		try {
			connection = DriverManager.getConnection(db_name, db_username, db_password);
			statement = connection.prepareStatement(query);
			resultSet = statement.executeQuery();
			
			while (resultSet.next()) {
				
				String firstName = resultSet.getString("firstname");
				String middleInitial = resultSet.getString("middleinitial");
				char middleInitialReal = middleInitial.charAt(0);
				String lastName = resultSet.getString("lastName");
				String organizationName = resultSet.getString("organizationName");
				String departmentName = resultSet.getString("departmentName");
				String positionTitle = resultSet.getString("positionTitle");
				String departmentContactName = resultSet.getString("departmentContactName");
				String workContactName = resultSet.getString("workContactName");
				String email = resultSet.getString("email");
				String usernameAc = resultSet.getString("username");
				String password = resultSet.getString("password");
				String userType = resultSet.getString("userType");
				boolean isApproved = resultSet.getBoolean("isApproved");
				
				Account accountToReturn = new Account(firstName,middleInitialReal,lastName,
						organizationName, departmentName,positionTitle, departmentContactName,
						workContactName,email,usernameAc,password,userType,isApproved);

				return accountToReturn;
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		finally {
			if (resultSet != null) try { resultSet.close(); } catch (SQLException ignore) {}
			if (statement != null) try { statement.close(); } catch (SQLException ignore) {}
			if (connection != null) try { connection.close(); } catch (SQLException ignore) {}
		}

		return null;
	}

	//Report Queries
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

	public ArrayList<Project> retrieveMTP(int year){
		List result = null;
		ReportQueries rq = new ReportQueries();
		String query = rq.getMTPQuery(year);
		try {
			result = connect(query);
		} catch (SQLException e) {
			System.out.printf("error");
		}

		//needs implementation
		return listToProject(result);
	
	}

	
	private List connect(String query) throws SQLException{
		Connection conn = null;
		PreparedStatement  stmt = null;
		ResultSet result = null;
		List listResult = null;

		try{
			//establish connection
			conn = DriverManager.getConnection(db_name, db_username, db_password);

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
//		ArrayList<Project> result = new ArrayList<Project>();
//		for (int i = 0; i < list.size();  i++){
//			HashMap mp = (HashMap) list.get(i);
//			Project p = new Project((String)mp.get("name"), (String)mp.get("city"), (int)mp.get("year"));	
//			result.add(p);
//		}

		return null;
	}


	private boolean checkAffectedRows(String query)
	{
		int rowsAffected = -1;
		try {
			Connection conn = DriverManager.getConnection(db_name, db_username, db_password);
			PreparedStatement pstmt = conn.prepareStatement(query);
			rowsAffected = pstmt.executeUpdate(query);
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if(rowsAffected==0)
			return false;
		return true;
	}

	//Project Queries
		
		//create projects
		public boolean createProject(LinkedHashMap<String, Object> projectInfo){return false;}
		public boolean  createCost(LinkedHashMap<String, Object> costInfo, int p_id)
		{
			ProjectQueries p = new ProjectQueries();
			String query = p.createCostQuery();
			
			int rowsAffected = -1;
			try {
				Connection conn = DriverManager.getConnection(db_name, db_username, db_password);
				PreparedStatement pstmt = conn.prepareStatement(query);
				//set values
				pstmt.setInt(1, p_id);
				pstmt.setInt(2, (Integer) costInfo.get("constructionCost"));
				pstmt.setInt(3, (Integer)costInfo.get("constCost"));
				pstmt.setInt(4, (Integer)costInfo.get("contingencyCost"));
				pstmt.setInt(5, (Integer)costInfo.get("ftaTransferCost"));
				pstmt.setInt(6, (Integer)costInfo.get("nonConstructionCost"));
				pstmt.setInt(7, (Integer)costInfo.get("changeOrderCost"));
				pstmt.setInt(8, (Integer)costInfo.get("preEngCost"));
				pstmt.setInt(9, (Integer)costInfo.get("rightOfWayCost"));
				
				rowsAffected = pstmt.executeUpdate(query);
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			if(rowsAffected==0)
				return false;
			return true;
		}
		public boolean createFundedProjects(LinkedHashMap<String, Object> fprojectInfo, int p_id)
		{
			ProjectQueries p = new ProjectQueries();
			String query = p.createFundedProjectQuery();
			
			int rowsAffected = -1;
			try {
				Connection conn = DriverManager.getConnection(db_name, db_username, db_password);
				PreparedStatement pstmt = conn.prepareStatement(query);
				//set values
				pstmt.setInt(1, p_id);
				pstmt.setString(2, (String) fprojectInfo.get("amendmentDate"));
				pstmt.setString(3, (String) fprojectInfo.get("cnNumber"));
				pstmt.setString(4, (String) fprojectInfo.get("csjNumber"));
				pstmt.setString(5, (String) fprojectInfo.get("tipName"));
				pstmt.setString(6, (String) fprojectInfo.get("tipYear"));
				
				
				rowsAffected = pstmt.executeUpdate(query);
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			if(rowsAffected==0)
				return false;
			return true;
		}
		public boolean createFundedTransit(LinkedHashMap<String, Object> projectInfo, int p_id){return false;}
		public boolean createFunding(LinkedHashMap<String, Object> projectInfo, int p_id){return false;}
		public boolean createOrganization(LinkedHashMap<String, Object> projectInfo, int p_id){return false;}
		public boolean createProposedProjects(LinkedHashMap<String, Object> projectInfo, int p_id){return false;}
		public boolean createProposedTransitProjects(LinkedHashMap<String, Object> projectInfo, int p_id){return false;}
		
		
		//update projects
		public boolean updateProject(int p_id, String field, Object value)
		{
			ProjectQueries p = new ProjectQueries();
			String query = p.updateProjectQuery(p_id, field, value);
			return checkAffectedRows(query);
		}
		public boolean updateCost(int p_id, String field, Object value)
		{
			ProjectQueries p = new ProjectQueries();
			String query = p.updateCostQuery(p_id, field, value);
			return checkAffectedRows(query);
		}
		public boolean updateFundedProjects(int p_id, String field, Object value)
		{
			ProjectQueries p = new ProjectQueries();
			String query = p.updateFundedProjectQuery(p_id, field, value);
			return checkAffectedRows(query);
		}
		public boolean updateFundedTransit(int p_id, String field, Object value)
		{
			ProjectQueries p = new ProjectQueries();
			String query = p.updateFundedTransitQuery(p_id, field, value);
			return checkAffectedRows(query);
		}
		public boolean updateFunding(int p_id, String field, Object value)
		{
			ProjectQueries p = new ProjectQueries();
			String query = p.updateFundingQuery(p_id, field, value);
			return checkAffectedRows(query);
		}
		public boolean updateOrganization(int p_id, String field, Object value)
		{
			ProjectQueries p = new ProjectQueries();
			String query = p.updateOrganizationQuery(p_id, field, value);
			return checkAffectedRows(query);
		}
		public boolean updateProposedProjects(int p_id, String field, Object value)
		{
			ProjectQueries p = new ProjectQueries();
			String query = p.updateProposedProjectQuery(p_id, field, value);
			return checkAffectedRows(query);
		}
		public boolean updateProposedTransitProjects(int p_id, String field, Object value)
		{
			ProjectQueries p = new ProjectQueries();
			String query = p.updateProposedTransitQuery(p_id, field, value);
			return checkAffectedRows(query);
		}
		
		
		//retrieve 
		public Map retrieveProject(int p_id){return null;}
		public Map  retrieveCost(int p_id){return null;}
		public Map retrieveFundedProjects(int p_id){return null;}
		public Map retrieveFundedTransit(int p_id){return null;}
		public Map retrieveFunding(int p_id){return null;}
		public Map retrieveOrganization(int p_id){return null;}
		public Map retrieveProposedProjects(int p_id){return null;}
		public Map retrieveProposedTransitProjects(int p_id){return null;}
		
		//delete projects
		public boolean deleteProject(int p_id)
		{
			//delete all related tables
			deleteCost(p_id);
			deleteFundedProjects(p_id);
			deleteFundedTransit(p_id);
			deleteFunding(p_id);
			deleteOrganization(p_id); 
			deleteProposedProject(p_id);
			deleteProposedTransitProject(p_id);
			
			ProjectQueries p = new ProjectQueries();
			String query = p.deleteProject(p_id);
			return checkAffectedRows(query);
		}
		public boolean deleteCost(int p_id)
		{
			ProjectQueries p = new ProjectQueries();
			String query = p.deleteCostQuery(p_id);
			return checkAffectedRows(query);
		}
		public boolean deleteFundedProjects(int p_id)
		{
			ProjectQueries p = new ProjectQueries();
			String query = p.deleteFundedProjectQuery(p_id);
			return checkAffectedRows(query);
		}
		public boolean deleteFundedTransit(int p_id)
		{
			ProjectQueries p = new ProjectQueries();
			String query = p.deleteFundedTransitQuery(p_id);
			return checkAffectedRows(query);
		}
		public boolean deleteFunding(int p_id)
		{
			ProjectQueries p = new ProjectQueries();
			String query = p.deleteFundingQuery(p_id);
			return checkAffectedRows(query);
		}
		public boolean deleteOrganization(int p_id)
		{
			ProjectQueries p = new ProjectQueries();
			String query = p.deleteOrganizationQuery(p_id);
			return checkAffectedRows(query);
		}
		public boolean deleteProposedProject(int p_id)
		{
			ProjectQueries p = new ProjectQueries();
			String query = p.deleteProposedProjectQuery(p_id);
			return checkAffectedRows(query);
		}
		public boolean deleteProposedTransitProject(int p_id)
		{
			ProjectQueries p = new ProjectQueries();
			String query = p.deleteProposedTransitQuery(p_id);
			return checkAffectedRows(query);
		}

		private Map toMap(ResultSet rs){return null;}

	
	
}