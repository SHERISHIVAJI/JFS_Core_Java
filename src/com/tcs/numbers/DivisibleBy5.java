package com.tcs.numbers;
/*
Rule:
If the last digit is 0 or 5, the number is divisible by 5.
 */
import java.util.Scanner;

public class DivisibleBy5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int num = sc.nextInt();
		int rem = num % 10;
		if(rem == 0 || rem == 5)
			System.out.println(num + " is divisible by 5");
		else
			System.out.println(num + " is not divisible by 5");
		sc.close();
	}

}
