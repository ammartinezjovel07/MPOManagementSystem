package project;

import java.util.LinkedHashMap;

public class Cost
{
	LinkedHashMap<String, Object> projectCostElements; 
	
	public Cost()
	 {
		 
	 }
	 
	 public Cost(long constructionCost, long constEngCost, long contingencyCost, long ftaTransferCost, 
			 long nonConstructionCost, long changeOrderCost, long preEngCost, long rightOfWayCost)
	 {
		 this.projectCostElements = new LinkedHashMap <String, Object>(); 
		 
		 projectCostElements.put("constructionCost", constructionCost);
		 projectCostElements.put("constEngCost", constEngCost);
		 projectCostElements.put("contingencyCost", contingencyCost);
		 projectCostElements.put("ftaTransferCost", ftaTransferCost);
		 projectCostElements.put("nonConstructionCost", nonConstructionCost);
		 projectCostElements.put("changeOrderCost", changeOrderCost);
		 projectCostElements.put("preEngCost", preEngCost);
		 projectCostElements.put("rightOfWayCost", rightOfWayCost);
		 
	 }
}
