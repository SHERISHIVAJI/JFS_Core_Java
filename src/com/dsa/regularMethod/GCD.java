package com.dsa.regularMethod;

public class GCD {
	public static void main(String[] args) {
		int num1 = 12, num2 = 18;
		System.out.println(gcd(num1, num2));
	}

	private static int gcd(int num1, int num2) {
		while(num2 != 0) {
			int temp = num1%num2;
			num1 = num2;
			num2 = temp;
		}
		return num1;
	}
}
