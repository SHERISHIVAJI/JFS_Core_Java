package com.method;

public class StaticMethodCallingAnotherStaticMethod {

	public static int a = 10, b = 4;
	
	public static void multiply() {
		System.out.println("Multiplication = " + (a * b));
	}
	
	public static void showResult() {
		multiply();
		System.out.println("Calculation Done");
	}
	
	public static void main(String[] args) {
		showResult();
	}

}
