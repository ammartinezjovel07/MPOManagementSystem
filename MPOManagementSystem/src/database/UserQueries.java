package database;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class UserQueries {

	public static String createUserQueries(HashMap<String,Object> userInfo)
	{
		String query = "Insert into users values( ";
		String values ="";
		Iterator entries = userInfo.entrySet().iterator();
		while (entries.hasNext()) {
		  Entry thisEntry = (Entry) entries.next();
		  Object value = thisEntry.getValue();
		  values += value+",";
		}
		query += values+")";
		System.out.print(query);
		return query;
	}
	public static String retrieveUserQueries(String email)
	{
		String query = "SELECT * from users where email = ";
		return query;
	}
	public static String updateUserQueries(Map<String, String> userInfo, int id){return null;}
	public static String deleteUserQueries(String email){return null;}
	}
