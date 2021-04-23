package com.mnaufalazwar;

public class FactoryPlan {
	
	public Plan getPlan(String type) {
		if(type == null) {
			return null;
		}
		
		switch(type.toLowerCase()) {
		case "domestic":
			return new PlanDomestic();
		case "commercial":
			return new PlanCommercial();
		case "institutional":
			return new PlanInstitutional();
		default :
			return null;
		}
	}

}
