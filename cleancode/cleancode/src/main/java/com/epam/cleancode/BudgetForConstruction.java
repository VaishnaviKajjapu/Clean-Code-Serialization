package com.epam.cleancode;

public class BudgetForConstruction {
	double calculatesConstructionCost(double area,int standard, int fullyAutomated){
		
		double costPerSquareFeet;
		
		int prizePerSquareFeet = 0;
		
		if( standard == 1){
			
			prizePerSquareFeet = 1200;
			
		} else if(standard == 2){
			
			prizePerSquareFeet = 1500;
			
		}else if(standard == 3){
			
			if(fullyAutomated != 0){
				
				prizePerSquareFeet = 2500;
				
			}else{
				
				prizePerSquareFeet = 1800;
				
			}
			
		}
		
		costPerSquareFeet = area*prizePerSquareFeet;
		
		return costPerSquareFeet;
	}
	
}
