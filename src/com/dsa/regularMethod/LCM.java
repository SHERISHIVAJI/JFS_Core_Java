package com.dsa.regularMethod;

public class LCM {
	public static void main(String[] args) {
		int num1 = 12, num2 = 18;
		
		System.out.println((num1 * num2) / findGCD(num1, num2));
	}

	private static int findGCD(int num1, int num2) {
		while(num2 != 0) {
			int rem = num1%num2;
			num1 = num2;
			num2 = rem;
		}
		return num1;
	}
}
