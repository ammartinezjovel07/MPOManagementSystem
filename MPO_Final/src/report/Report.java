package report;
import java.util.ArrayList;
import database.DatabaseHandler;
import project.Project;

public class Report
{	
	boolean capacityProject;
	String city;
	String county;
	String dotDistrict;
	int federalFiscalYear;
	String federalFunctionalClassification;
	String fundProjectType;
	String highwayRoadwayName;
	String limitFrom;
	String limitTo;
	int networkYear;
	int numberExistingLanes;
	long numberMiles;
	int numberProjectedLines;
	String projectDescription;
	String projectID;
	String tipProjectName;
	String projectPhase;
	String projectType;
	String remarks;
	String sponsorAgency;
	String transitInformation;
	long projectCost;
	long projectFunding;

	public ArrayList<Project> generateTIPReport(int year){
		
		return new DatabaseHandler().retrieveTIP(year);
	}

	public ArrayList<Project> generateMTPReport(int year){
		return new DatabaseHandler().retrieveMTP(year);
	}

}
