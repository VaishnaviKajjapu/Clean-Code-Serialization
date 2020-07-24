package com.epam.cleancode;

import java.util.Scanner;

public class TesterForBudgetCalculation {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		BudgetForConstruction budget = new BudgetForConstruction();
		System.out.println("Enter Standard of the house ,1 -> LowStandard ,2 -> aboveStandard, 3->highStandard");
		int standard = sc.nextInt();
		int fullyAutomated;
		if( standard == 3){
			System.out.println("Enter 1 for fully automated house else enter 0");
			fullyAutomated = sc.nextInt();
		}else{
			fullyAutomated = 0;
			
		}
		System.out.println("Enter the area ");
		double area = sc.nextDouble();
		System.out.println(budget.calculatesConstructionCost(area, standard, fullyAutomated));
		sc.close();
		
}

}
