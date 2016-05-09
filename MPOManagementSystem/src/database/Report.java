package database;

import java.sql.SQLException;
import java.util.ArrayList;

public class Report {

	
	public ArrayList<Project> generateTIPReport(int year){
		return new DatabaseHandler().retrieveTIP(year);
	}
}
