package project;

import java.util.LinkedHashMap;

public class SubmittedProject
{
	LinkedHashMap <String, Object> submittedProjectElements;
		
	public SubmittedProject()
	{
		
	}
	
	public SubmittedProject(String tpbLink, String federalApprovalLink, String stateLink,String submissionstatus)
	{
		this.submittedProjectElements = new LinkedHashMap <String, Object>();
		submittedProjectElements.put("tpbLink", tpbLink);
		submittedProjectElements.put("federalApprovalLink", federalApprovalLink);
		submittedProjectElements.put("stateLink", stateLink);
		submittedProjectElements.put("submissionstatus", submissionstatus);
	}

}
