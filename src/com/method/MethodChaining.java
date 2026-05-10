package com.method;

public class MethodChaining {
	public static int a = 20;
	public static int b = 30;
	
	public static void sum() {
		System.out.println("Sum = " + (a + b));
	}
	
	public static void average() {
		sum();
		System.out.println("Average = " + (a + b)/2);
	}

	public static void main(String[] args) {
		average();
	}

}
