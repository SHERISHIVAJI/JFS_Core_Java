package com.conditionalStatements;

public class GreaterNumber {
	public int findGreater(int num1, int num2) {
		if(num1 > num2)
			return num1;
		return num2;
	}
	
	public static void main(String[] args) {
		GreaterNumber obj = new GreaterNumber();
		System.out.println("Greater number (10, 25) : " + obj.findGreater(10, 25));
	}
}
