package com.mnaufalazwar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(
				new InputStreamReader(System.in));
		
		System.out.println("Enter plan type");
		
		String planType = reader.readLine();
		
		System.out.println("Enter unit");
		
		int unit = Integer.parseInt(reader.readLine());
		
		Plan plan = (new FactoryPlan()).getPlan(planType);
		
		plan.getRate();
		
		plan.calculateBill(unit);
		
	}

}
