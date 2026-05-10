package com.tcs.numbers;

import java.util.Scanner;

public class DivisibleBy9 {
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
		if(sum % 9 == 0)
			System.out.println(num + " is divisible by 9");
		else
			System.out.println(num + " is not divisible by 9");
		sc.close();
	}
}
