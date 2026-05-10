package com.conditionalStatements;

public class LargestOfThreeNumbers {
	public static void main(String[] args) {
		int num1 = 10, num2 = 1, num3 = 50;
		if(num1 > num2 && num1 > num3)
			System.out.println(num1 + " is largest among " + num1 + ", " + num2 + ", and " + num3);
		if(num2 > num3)
			System.out.println(num2 + " is largest among " + num1 + ", " + num2 + ", and " + num3);
		else
			System.out.println(num3 + " is largest among " + num1 + ", " + num2 + ", and " + num3);
	}
}
