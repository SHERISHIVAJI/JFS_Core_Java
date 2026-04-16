package com.inheritance;

import java.util.Scanner;

public class PrimeOrNot {
	
	public static boolean isPrime(int num) {
		if(num <= 0) return false;
		if(num <= 3) return true;
		if((num&1) == 0) return false;
		for(int i = 3; i * i <= num; i++)
			if(num % i == 0) return false;
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int num = sc.nextInt();
		if(isPrime(num)) {
			System.out.println(num + " is a prime number");
		}
		else {
			System.out.println(num + " is not a prime number");
		}
		
		sc.close();
	}
}
