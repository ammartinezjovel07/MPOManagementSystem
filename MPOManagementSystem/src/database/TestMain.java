package database;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

import user.*;


public class TestMain {

	
	public static void main(String args[])
	{
	
//		Administrator admin = new Administrator();
//		admin.createAccount("luis", 'c', "luis", "luis", "luis", "luis", "luis", "luis", "luis", "luis", "luis", "luis", true);
//		admin.deleteAccount("me");
//		admin.updateAccount("lues", "email", "here");
//		
//		MPOLeadUser mpoLead = new MPOLeadUser();
//		mpoLead.approveAccount("luis");
//		
//		RegularUser ruser = new RegularUser();
//		ruser.verifyCredentials("luis", "not");
		
        LinkedHashMap projectElements = new LinkedHashMap <String, Object>();
        
		projectElements.put("projectTitle", "P_Title");
		projectElements.put("projectID", 8847);
		projectElements.put("projectDescription", "Description");
		projectElements.put("projectPhases", "phase1");
		projectElements.put("projectType", 5);
		
     Set<Object> items= projectElements.keySet();
     System.out.println(items);
    		 
	}
}
