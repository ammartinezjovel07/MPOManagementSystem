package database;

import java.util.ArrayList;

public class ReportQueries {


	
	//retrieves projects above year passed
	public  String getTipQuery(int year)
	{
		String startyr = Integer.toString(year);
		String endyr = Integer.toString(year+3);
		
		return "Select * from projects where ( year  BETWEEN '" + startyr + "' AND '" + endyr+ "' )" ;
	}
	
	
	public static String getMTPQuery(int year)
	{
		String startyr = Integer.toString(year);
		String endyr = Integer.toString(year+19);
		
		return "Select * from projects where ( year  BETWEEN '" + startyr + "' AND '" + endyr+ "' )" ;
	}
	
}
