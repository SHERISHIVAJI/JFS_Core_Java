package com.tcs.numbers;

/*
Rule:
If the number ends in 0, it is divisible by 10.
 */

import java.util.Scanner;

public class DivisibleBy10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int num = sc.nextInt();
		int rem = num % 10;
		if(rem == 0)
			System.out.println(num + " is divisible by 10");
		else
			System.out.println(num + " is not divisible by 10");
		sc.close();
	}
}
