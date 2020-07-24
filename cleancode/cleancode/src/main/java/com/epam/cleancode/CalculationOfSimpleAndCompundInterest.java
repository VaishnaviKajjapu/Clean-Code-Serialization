package com.epam.cleancode;

public class CalculationOfSimpleAndCompundInterest {
public double SimpleInterest(double principal, double rate, double time){
		
		return (principal * rate * time) / 100;
		
	}
	
	double CompoundInterest(double principal, double rate, double time){
		
		return principal * (Math.pow((1 + rate / 100), time)); 
		
	}

}
