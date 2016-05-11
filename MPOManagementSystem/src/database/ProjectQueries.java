package database;

import java.sql.PreparedStatement;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class ProjectQueries {
	String projectId = "Select * from projects where projectId = ";
	
/*
 * 
 * Every table needs a link to pid
 * @param projectInfo
 * @return
 */
	
	//create queries
	public String createCostQuery()
	{
		String query = "Insert Into cost(p_id, constructionCost, constCost, contingencyCost, ftaTransferCost, "
				+ "nonConstructionCost, changeOrderCost, preEngCost, rightofWayCost)"
				+ "Values(?, ?, ?, ?, ?, ?, ?, ?, ?)";
		return query;
//		Set<Object> items= elements.keySet();
//		int i = 0;
//	     for(Object k: items)
//	     {
//	    	 
//	        System.out.println(query += elements.get(k));
//	     }
	}
	public String createFundingQuery()
	{
		String query = "Insert Into funding(p_id, federalShare, fundingCategory, localContribution, localShare, "
				+ "regionalShare, stateShare)"
				+ "Values(?, ?, ?, ?, ?, ?, ?)";
		return query;
	}
	public String createOrganizationQuery()
	{
		String query = "Insert Into organization(p_id, contactFirstName, contactMiddleInitial, contactLastName, contactPositionTitle, "
				+ "contactDeptNumber, contactEmail, organizationName, workContactNumber)"
				+ "Values(?, ?, ?, ?, ?, ?, ?)";
		return query;
	}
	public String createFundedProjectQuery()
	{
		String query = "Insert Into fundedProjects(p_id, ammendmentDate, cnNumber, csjNumber, tipName, "
				+ "tipYear)"
				+ "Values(?, ?, ?, ?, ?, ?)";
		return query;
	}
	public String createFundedTransitQuery()
	{
		String query = "Insert Into fundedTransitProjects(p_id, tdcAwardAmmount, tdcAwardDate "
				+ ")"
				+ "Values(?, ?, ?)";
		return query;
	}
	
	public String createProposedProjectQuery()
	{
		String query = "Insert Into proposedProjects"
				+ "(p_id, approvedProjectId, submissionDeadline "
				+ "safetyImproved, trafficCalming, comprehensivePlan,"
				+ "transitServiceProgram, feasibilityStidies, gradedSeparatedCrossing,"
				+ "impavedRoads, improvedAirQuality, localSupportCommunity,"
				+ "localSupportGov, localSupportSchool, connectResAreas,"
				+ "connectIndAreas, connectCommAreas, connectBikePath, "
				+ "connectRuralAreas, connectPedPath, connectTransit, "
				+ "connectRecAct, sustainLandUse, sustainEconomy, "
				+ "sustainRemoveBarriers, fulfillMap21Goal, fulfillMap21Infra, "
				+ "fulfillMap21Congress, fulfillMap21SysRel, fulfillMap21Vitality, "
				+ "fulfillMap21Sustain, satisfyCMPManage, satisfyCMPTraffic, "
				+ "satisfyCMPPubTransp, satisfyCMPRoadCap, satisfyNonCMP, "
				+ "sponsorInvesCost, commitToFederalFunding, phaseInvest, "
				+ "submissionType, workflowStatus)"
				+ "Values("
				+ "?, ?, ?, ?, ?, ?, ?, ?, ?, ?, "
				+ "?, ?, ?, ?, ?, ?, ?, ?, ?, ?, "
				+ "?, ?, ?, ?, ?, ?, ?, ?, ?, ?, "
				+ "?, ?, ?, ?, ?, ?, ?, ?, ?, ?, "
				+ "?)";
		return query;
	}
	public String createProposedTransitQuery()
	{
		String query = "Insert Into proposedTransitProjects"
				+ "(p_id, apportionmentYear, section5309ID "
				+ "tdcAmmountRequest, transitProjectType)"
				+ "Values(?, ?, ?, ?, ?)";
		return query;
	}
	//finish
	public String createProjectQuery()
	{
		String query = "Insert Into projects"
				+ "(p_id, projectTitle, projectId, projectDescription, projectPhases, "
				+ "projectType, termini, network, totalProjectCost, sponsor, yoe,"
				+ "airQualityAnalysisCO, airQualityAnalysisNOX, airQualityAnalysisVOC, area, capacityProject,"
				+ "city, county, dotDistrict, federalFiscalyear, federalFunctionalClassification, fundProjectType,"
				+ "highwayRoadwayName, limitFrom, limitTo, networkYear, numberMiles, numberExistingLanes, "
				+ "numberProjectedLanes, remarks, scopeOfProduct, stateSystemRoad, transitInformation)"
				+ "Values("
				+ "?, ?, ?, ?, ?, ?, ?, ?, ?, ?, "
				+ "?, ?, ?, ?, ?, ?, ?, ?, ?, ?, "
				+ "?, ?, ?, ?, ?, ?, ?, ?, ?, ?, "
				+ "?, ?, ? )";
		return query;
	}
	
	
	
	//retrieve queries
	public String retrieveCostQuery(int p_id)
	{
		String query =  "Select * from cost where p_id = " + p_id;
		return query;
	}
	public String retrieveFundingQuery(int p_id)
	{
		String query =  "Select * from funding where p_id = " + p_id;
		return query;
	}
	public String retrieveOrganizationQuery(int p_id)
	{
		String query =  "Select * from orgnization where p_id = " + p_id;
		return query;
	}
	public String retrieveFundedProjectQuery(int p_id)
	{
		String query =  "Select * from fundedProjects where p_id = " + p_id;
		return query;
	}
	public String retrieveFundedTransitQuery(int p_id)
	{
		String query =  "Select * from fundedTransit where p_id = " + p_id;
		return query;
	}
	public String retrieveProposedProjectQuery(int p_id)
	{
		String query =  "Select * from proposedProjects where p_id = " + p_id;
		return query;
	}
	public String retrieveProposedTransitQuery(int p_id)
	{
		String query =  "Select * from proposedTransitProjects where p_id = " + p_id;
		return query;
	}
	public String retrieveProject(int p_id)
	{
		String query =  "Select * from projects where p_id = " + p_id;
		return query;
	}

	
	//updates
	public String updateProjectQuery(int p_id, String field, Object value)
	{
		String query = "UPDATE cost SET "+field+" = "+"\""+value+"\" where username = \""+p_id+"\"";
		return query;
	}
	public String updateCostQuery(int p_id, String field, Object value)
	{
		String query = "UPDATE cost SET "+field+" = "+"\""+value+"\" where username = \""+p_id+"\"";
		return query;
	}
	public String updateFundingQuery(int p_id, String field, Object value)
	{
		String query = "UPDATE funding SET "+field+" = "+"\""+value+"\" where username = \""+p_id+"\"";
		return query;
	}
	public String updateOrganizationQuery(int p_id, String field, Object value)
	{
		String query = "UPDATE organization SET "+field+" = "+"\""+value+"\" where username = \""+p_id+"\"";
		return query;
	}
	public String updateFundedProjectQuery(int p_id, String field, Object value)
	{
		String query = "UPDATE fundedProjects SET "+field+" = "+"\""+value+"\" where username = \""+p_id+"\"";
		return query;
	}
	public String updateFundedTransitQuery(int p_id, String field, Object value)
	{
		String query = "UPDATE fundedTransit SET "+field+" = "+"\""+value+"\" where username = \""+p_id+"\"";
		return query;
	}
	public String updateProposedProjectQuery(int p_id, String field, Object value)
	{
		String query = "UPDATE proposedProjects SET "+field+" = "+"\""+value+"\" where username = \""+p_id+"\"";
		return query;
	}
	public String updateProposedTransitQuery(int p_id, String field, Object value)
	{
		String query = "UPDATE proposedTransitProjects SET "+field+" = "+"\""+value+"\" where username = \""+p_id+"\"";
		return query;
	}
	
	
	// Delete queries
	public String deleteCostQuery(int p_id)
	{
		String query =  "delete from cost where p_id = " + p_id;
		return query;
	}
	public String deleteFundingQuery(int p_id)
	{
		String query =  "delete from funding where p_id = " + p_id;
		return query;
	}
	public String deleteOrganizationQuery(int p_id)
	{
		String query =  "delete from organization where p_id = " + p_id;
		return query;
	}
	public String deleteFundedProjectQuery(int p_id)
	{
		String query =  "delete from fundedProjects where p_id = " + p_id;
		return query;
	}
	public String deleteFundedTransitQuery(int p_id)
	{
		String query =  "delete from fundedTransit where p_id = " + p_id;
		return query;
	}
	public String deleteProposedProjectQuery(int p_id)
	{
		String query =  "delete from proposedProjects where p_id = " + p_id;
		return query;
	}
	public String deleteProposedTransitQuery(int p_id)
	{
		String query =  "delete from proposedTransitProjects where p_id = " + p_id;
		return query;
	}
	public String deleteProject(int p_id)
	{
		String query =  "delete from projects where p_id = " + p_id;
		return query;
	}
	
	
	
	public  String createProjectQueries(Map<String, String> projectInfo){return null;}
	public String retriveProjectQueries(String projectId)
	{
		projectId += projectId;
		return projectId;
	}
	

}

