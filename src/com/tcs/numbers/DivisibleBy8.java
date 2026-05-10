package com.tcs.numbers;

import java.util.Scanner;

/*
Rule:
Look at the last three digits.
If those three digits form a number divisible by 8, the whole number is divisible by 8.
 */
public class DivisibleBy8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int num = sc.nextInt();
		int rem = num % 1000;
		if(rem % 8 == 0)
			System.out.println(num + " is divisible by 8");
		else
			System.out.println(num + " is not divisible by 8");
		sc.close();
	}

}
