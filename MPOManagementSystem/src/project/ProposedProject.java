package project;

import java.util.LinkedHashMap;

public class ProposedProject
{

	LinkedHashMap <String, Object> proposedProjectElements;
	
	public ProposedProject()
	{
		
	}

	public ProposedProject(String approvedProjectID, String submissionDeadline, 
			boolean safetyImproved, boolean trafficCalming, boolean comprehensivePlan, boolean transitServiceProgram, boolean feasibilityStudies, 
			boolean gradeSeparatedCrossing, boolean unpavedRoads, boolean improveAirQuality, boolean localSupportCommunity, boolean localSupportGov,
			boolean localSupportSchool, boolean connectResAreas, boolean connectIndAreas, boolean connectCommAreas, 
			boolean connectBikePath, boolean connectRuralAreas, boolean connectPedPath, boolean connectTransit,
			boolean connectRecAct, boolean sustainLandUse, boolean sustainEconomy, boolean sustainRemoveBarriers,
			boolean fulfillMap21Goal, boolean fulfillMap21Infra, boolean fulfillMap21Conges, boolean fulfillMap21SysRel,
			boolean fulfillMap21Vitality, boolean fulfillMap21Sustain, boolean satisfyCMPManage, boolean satisfyCMPTraffic,
			boolean satisfyCMPPubTransp, boolean satisfyCMPRoadCap, boolean satisfyNonCMP, int sponsorInvestCost,
			String committToFederalFunding, boolean phaseInvest, String submissionType, String workflowStatus)
	{
		this.proposedProjectElements =  new LinkedHashMap <String, Object>();
		proposedProjectElements.put("approvedProjectID", approvedProjectID);
		proposedProjectElements.put("submissionDeadline", submissionDeadline);
		
		proposedProjectElements.put("safetyImproved", safetyImproved);
		proposedProjectElements.put("trafficCalming", trafficCalming);
		proposedProjectElements.put("comprehensivePlan", comprehensivePlan);
		proposedProjectElements.put("transitServiceProgram", transitServiceProgram);
		proposedProjectElements.put("feasibilityStudies", feasibilityStudies);
		proposedProjectElements.put("gradeSeparatedCrossing", gradeSeparatedCrossing);
		proposedProjectElements.put("unpavedRoads", unpavedRoads);
		proposedProjectElements.put("improveAirQuality", improveAirQuality);
		proposedProjectElements.put("localSupportCommunity", localSupportCommunity);
		proposedProjectElements.put("localSupportGov", localSupportGov);
		proposedProjectElements.put("localSupportSchool", localSupportSchool);
		proposedProjectElements.put("connectResAreas", connectResAreas);
		proposedProjectElements.put("connectIndAreas", connectIndAreas);
		proposedProjectElements.put("connectCommAreas", connectCommAreas);
		proposedProjectElements.put("connectBikePath", connectBikePath);
		proposedProjectElements.put("connectRuralAreas", connectRuralAreas);
		proposedProjectElements.put("connectPedPath", connectPedPath);
		proposedProjectElements.put("connectTransit", connectTransit);
		proposedProjectElements.put("connectRecAct", connectRecAct);
		proposedProjectElements.put("sustainLandUse", sustainLandUse);
		proposedProjectElements.put("sustainEconomy", sustainEconomy);
		proposedProjectElements.put("sustainRemoveBarriers", sustainRemoveBarriers);
		proposedProjectElements.put("fulfillMap21Goal", fulfillMap21Goal);
		proposedProjectElements.put("fulfillMap21Infra", fulfillMap21Infra);
		proposedProjectElements.put("fulfillMap21Conges", fulfillMap21Conges);
		proposedProjectElements.put("fulfillMap21SysRel", fulfillMap21SysRel);
		proposedProjectElements.put("fulfillMap21Vitality", fulfillMap21Vitality);
		proposedProjectElements.put("fulfillMap21Sustain", fulfillMap21Sustain);
		proposedProjectElements.put("satisfyCMPManage", satisfyCMPManage);
		proposedProjectElements.put("satisfyCMPTraffic", satisfyCMPTraffic);
		proposedProjectElements.put("satisfyCMPPubTransp", satisfyCMPPubTransp);
		proposedProjectElements.put("satisfyCMPRoadCap", satisfyCMPRoadCap);
		proposedProjectElements.put("satisfyNonCMP", satisfyNonCMP);
		proposedProjectElements.put("sponsorInvestCost", sponsorInvestCost);
		proposedProjectElements.put("committToFederalFunding", committToFederalFunding);
		proposedProjectElements.put("phaseInvest", phaseInvest);
		proposedProjectElements.put("submissionType", submissionType);
		proposedProjectElements.put("workflowStatus", workflowStatus);
	}
}
