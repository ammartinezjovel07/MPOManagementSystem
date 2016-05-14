package project;

import java.util.LinkedHashMap;

public class Organization
{
	LinkedHashMap<String, Object> organizationElements;
	
	public Organization()
	{
		
	}
	
	public Organization(String contactFirstName, char contactmiddleInitial,String contactLastName,String contactPositionTitle,
			String contactDeptName, String contactDeptNumber, String contactEmail, String organizationName,String workContactNumber)
	{
		this.organizationElements = new LinkedHashMap<String, Object>();

		organizationElements.put("contactFirstName", contactFirstName);
		organizationElements.put("contactmiddleInitial", contactmiddleInitial);
		organizationElements.put("contactLastName", contactLastName);
		organizationElements.put("contactPositionTitle", contactPositionTitle);
		organizationElements.put("contactDeptNumber", contactDeptNumber);
		organizationElements.put("contactDeptName", contactDeptName);
		organizationElements.put("contactEmail", contactEmail);
		organizationElements.put("organizationName", organizationName);
		organizationElements.put("workContactNumber", workContactNumber);
			
	}
}
