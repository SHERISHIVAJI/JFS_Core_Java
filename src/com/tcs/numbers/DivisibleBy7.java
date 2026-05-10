package com.tcs.numbers;

import java.util.Scanner;

/*
Rule (easy method):
1.Take the last digit.
2.Double it.
3.Subtract it from the remaining number.
If the answer is divisible by 7, the original number is also divisible by 7.
 */

public class DivisibleBy7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int num = sc.nextInt();
		int rem = num % 10;
		rem *= 2;
		int temp = num / 10;
		temp -= rem;
		if(temp % 7 == 0)
			System.out.println(num + " is divisible by 7");
		else
			System.out.println(num + " is not divisible by 7");
		sc.close();
	}

}
