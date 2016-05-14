package project;

import java.util.LinkedHashMap;

public class ProposedTransitProject extends ProposedProject
{
	LinkedHashMap <String, Object> proposedTransitProjectElements;

	public ProposedTransitProject()
	{
		
	}
	
	public ProposedTransitProject(int apportionmentYear, String section5309ID,long tdcAmountRequested, String transitProjectType)
	{
		this.proposedTransitProjectElements = new LinkedHashMap <String, Object>();
		proposedTransitProjectElements.put("apportionmentYear", apportionmentYear);
		proposedTransitProjectElements.put("section5309ID", section5309ID);
		proposedTransitProjectElements.put("tdcAmountRequested", tdcAmountRequested);
		proposedTransitProjectElements.put("transitProjectType", transitProjectType);
	}	
}
