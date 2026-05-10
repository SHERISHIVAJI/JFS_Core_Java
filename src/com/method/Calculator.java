package com.method;

public class Calculator {
	public static double findAverage(int num1, int num2, int num3) {
		double avg = (num1 + num2 + num3) / 3.0;
		return Math.round(avg*100.0)/100.0;
	}
	
	public static void main(String[] args) {
		System.out.println(findAverage(12, 8, 15));
	}
}
