package database;


import java.util.LinkedHashMap;
import java.util.Map;

public class UserQueries {
	
	public UserQueries()
	{
		
	}

	public static String createUserQueries(LinkedHashMap<String,Object> userInfo)
	{
		String query = "Insert into users values(";
		String values ="";
		int i = 0;
		for (String key : userInfo.keySet()) {
			
			if(key.equals("isApproved"))
			{
				values+=userInfo.get(key).toString().toUpperCase();
				continue;
			}
			else
			{
				values+= "\""+userInfo.get(key).toString()+"\"";
			}			
			if(i < userInfo.size()-1)
			{
				values +=",";
				i++;
			}
		}
		query += values+")";
		System.out.println(query);
		return query;
	}
	
	public static String deleteUserQueries(String username)
	{
		String query = "Delete from users where username=\""+username+"\"";
		System.out.println(query);
		return query;
	}
	
	public static String updateUserQueries(String username, String field, String value)
	{
		String query = "UPDATE users SET "+field+" = "+"\""+value+"\" where username = \""+username+"\"";
		System.out.println(query);
		return query;
	}

	public static String approveUserAccountQueries(String username) {
		String query = "UPDATE users SET isApproved = TRUE where username = \""+username+"\"";
		System.out.println(query);
		return query;
	}

	public static String verifyCredentials(String username)
	{
		String query = "Select password from users where username=\""+username+"\"";
		System.out.println(query);
		return query;
	}
}
