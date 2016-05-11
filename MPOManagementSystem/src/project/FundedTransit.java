package project;

import java.util.LinkedHashMap;

public class FundedTransit
{
	LinkedHashMap<String, Object> fundedTransitProjectElements;
	
	public FundedTransit()
	{
		
	}
	
	public FundedTransit(long tdcAwardAmount, String tdcAwardDate)
	{
		this.fundedTransitProjectElements = new LinkedHashMap<String, Object>();
		
		fundedTransitProjectElements.put("tdcAwardAmount", tdcAwardAmount);
		fundedTransitProjectElements.put("tdcAwardDate", tdcAwardDate);
	}
}
