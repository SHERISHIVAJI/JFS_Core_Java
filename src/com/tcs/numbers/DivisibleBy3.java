package com.tcs.numbers;

import java.util.Scanner;

/*
Rule:
Add all the digits.
If the sum is divisible by 3, then the number is divisible by 3.
 */

public class DivisibleBy3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int num = sc.nextInt();
		int temp = num, rem, sum = 0;
		while(temp > 0) {
			rem = temp % 10;
			sum += rem;
			temp /=10;
		}
		if(sum % 3 == 0)
			System.out.println(num + " is divisible by 3");
		else
			System.out.println(num + " is not divisible by 3");
		sc.close();
	}
}
