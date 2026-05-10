package com.loopingStatements;

public class LCMOfTwoNumbers {
	public static int calculateLCM(int num1, int num2) {
		int gcd = 1;
		for(int i = 1; i <= num1 && i <= num2; i++) {
			if(num1 % i == 0 && num2 % i == 0)
				gcd = i;
		}
		int lcm = (num1 * num2) / gcd;
		
		return lcm;
	}
	
	public static void main(String[] args) {
		System.out.println("The LCM is: " + calculateLCM(4, 6));
	}
}
