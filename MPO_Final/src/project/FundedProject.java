package project;

import java.util.LinkedHashMap;

public class FundedProject
{
	LinkedHashMap<String, Object> fundedProjectElements;
	
	public FundedProject()
	{
		
	}
	
	public FundedProject(String amendmentDate, String cnNumber, String csjNumber,
			String tipName, int tipYear)
	{
		this.fundedProjectElements = new LinkedHashMap<String, Object>();
		
		fundedProjectElements.put("amendmentDate", amendmentDate);
		fundedProjectElements.put("cnNumber", cnNumber);
		fundedProjectElements.put("csjNumber", csjNumber);
		fundedProjectElements.put("tipName", tipName);
		fundedProjectElements.put("tipYear", tipYear);
	}
}
