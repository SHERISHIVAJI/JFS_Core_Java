package com.tcs.numbers;

/*
Rule:
Look at the last two digits.
If those two digits form a number divisible by 4, the whole number is divisible by 4.
 */

import java.util.Scanner;

public class DivisibleBy4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int num = sc.nextInt();
		int rem = num % 100;
		if(rem % 4 == 0)
			System.out.println(num + " is divisible by 4");
		else
			System.out.println(num + " is not divisible by 4");
		sc.close();
	}
}
