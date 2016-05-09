package project;

import java.util.LinkedHashMap;

public class Project
{
	LinkedHashMap<String, Object> projectElements;
	
	public Project()
	{
		
	}
	
	public Project(String projectTitle,String projectID, String projectDescription,String projectPhases, String projectType,String Termini,
			String network, String totalProjectCost, String sponsor, String yoe,long airQualityAnalysisCO,long airQualityAnalysisNOX,long airQualityAnalysisVOC,
			String area, boolean capacityProject, String city, String county, String dotDistrict, int federalFiscalYear, String federalFunctionalClassifications,
			String fundProjectType,String highwayRoadwayName, String limitFrom, String limitTo, int networkYear, long numberMiles, int numberExistingLanes,
			int numberProjectedLanes,String remarks,  String scopeOfProduct, String stateSystemRoad, String transitInformation)
	{
		this.projectElements = new LinkedHashMap <String, Object>();
		
		projectElements.put("projectTitle", projectTitle);
		projectElements.put("projectID", projectID);
		projectElements.put("projectDescription", projectDescription);
		projectElements.put("projectPhases", projectPhases);
		projectElements.put("projectType", projectType);
		projectElements.put("Termini", Termini);
		projectElements.put("network", network);
		projectElements.put("totalProjectCost", totalProjectCost);
		projectElements.put("sponsor", sponsor);
		projectElements.put("yoe", yoe);
		projectElements.put("airQualityAnalysisCO", airQualityAnalysisCO);
		projectElements.put("airQualityAnalysisNOX", airQualityAnalysisNOX);
		projectElements.put("airQualityAnalysisVOC", airQualityAnalysisVOC);
		projectElements.put("area", area);
		projectElements.put("capacityProject", capacityProject);
		projectElements.put("city", city);
		projectElements.put("county", county);
		projectElements.put("dotDistrict", dotDistrict);
		projectElements.put("federalFiscalYear", federalFiscalYear);
		projectElements.put("federalFunctionalClassifications", federalFunctionalClassifications);
		projectElements.put("fundProjectType", fundProjectType);
		projectElements.put("highwayRoadwayName", highwayRoadwayName);
		projectElements.put("limitFrom", limitFrom);
		projectElements.put("limitTo", limitTo);
		projectElements.put("networkYear", networkYear);
		projectElements.put("numberMiles", numberMiles);
		projectElements.put("numberExistingLanes", numberExistingLanes);
		projectElements.put("numberMiles", numberMiles);
		projectElements.put("numberProjectedLanes", numberProjectedLanes);
		projectElements.put("scopeOfProduct", scopeOfProduct);
		projectElements.put("stateSystemRoad", stateSystemRoad);
		projectElements.put("transitInformation", transitInformation);
	
	}

}
