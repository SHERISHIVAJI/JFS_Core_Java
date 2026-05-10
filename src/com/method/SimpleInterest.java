package com.method;

public class SimpleInterest {
	
	public static int principal = 5000, rate = 2, time = 2;
	
	public static void calculateInterest() {
		System.out.println("Simple Interest = " + (principal * rate * time) / 100);
	}

	public static void main(String[] args) {
		calculateInterest();
	}

}
