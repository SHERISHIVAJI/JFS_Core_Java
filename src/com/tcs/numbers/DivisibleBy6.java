package com.tcs.numbers;

import java.util.Scanner;

/*
Rule:
The number must be divisible by both 2 and 3.
 */
public class DivisibleBy6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int num = sc.nextInt();
		boolean flag = false;
		if(num % 2 == 0) {
			int temp = num, rem, sum = 0;
			while(temp > 0) {
				rem = temp % 10;
				sum += rem;
				temp /=10;
				if(sum % 3 == 0)
					flag = true;
			}
		}
		if(flag)
			System.out.println(num + " is divisible by 6");
		else
			System.out.println(num + " is not divisible by 6");
		sc.close();
	}
}
