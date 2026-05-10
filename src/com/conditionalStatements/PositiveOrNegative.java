package com.conditionalStatements;

public class PositiveOrNegative {
	public String checkNumber(int num) {
		if(num > 0)
			return "Positive";
		if(num < 0)
			return "Negative";
		return "Zero";
	}
	
	public static void main(String[] args) {
		PositiveOrNegative obj = new PositiveOrNegative();
		System.out.println("Check -5 : " + obj.checkNumber(-5));
	}
}
