package com.epam.cleancode;


import java.util.Scanner;

public class TesterForSimpleAndCompoundInterest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		CalculationOfSimpleAndCompundInterest calculate = new CalculationOfSimpleAndCompundInterest();
		
		
		
		
		System.out.println("Enter principal amount , rate , time ");
		double principal = sc.nextDouble();
		double rate = sc.nextDouble();
		double time = sc.nextDouble();
		
			System.out.println("SimpleInterest is:" +calculate.SimpleInterest(principal, rate, time));
			System.out.println("Compound Inetrest is:" +calculate.CompoundInterest(principal, rate, time));
			sc.close();
		}

}