package com.tcs.numbers;

/*
 
Rule:
If the last digit is even (0, 2, 4, 6, 8), the number is divisible by 2.
 
 */

import java.util.Scanner;

public class DivisibleBy2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int num = sc.nextInt();
		if(num % 2 == 0)
			System.out.println(num + " is divisible by 2");
		else
			System.out.println(num + " is not divisible by 2");
		sc.close();
	}

}
