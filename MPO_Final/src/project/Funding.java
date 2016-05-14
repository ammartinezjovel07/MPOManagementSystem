package project;

import java.util.LinkedHashMap;

public class Funding
{
	LinkedHashMap<String, Object> fundingElements;
	
	public Funding()
	{
		
	}
	
	public Funding(long federalShare,String fundingCategory,long localContribution, long localShare,
			long regionalShare, long stateShare)
	{
		this.fundingElements = new LinkedHashMap<String, Object>();
		
		fundingElements.put("federalShare", federalShare);
		fundingElements.put("fundingCategory", fundingCategory);
		fundingElements.put("localContribution", localContribution);
		fundingElements.put("localShare", localShare);
		fundingElements.put("regionalShare", regionalShare);
		fundingElements.put("stateShare", stateShare);
	}
}
