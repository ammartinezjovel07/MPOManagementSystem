package report;

import java.sql.SQLException;
import java.util.ArrayList;

import database.DatabaseHandler;
import database.Project;

public class Report {

	
	public ArrayList<Project> generateTIPReport(int year){
		return new DatabaseHandler().retrieveTIP(year);
	}
	
	public ArrayList<Project> generateMTPReport(int year){
		return new DatabaseHandler().retrieveMTP(year);
	}
	
}
