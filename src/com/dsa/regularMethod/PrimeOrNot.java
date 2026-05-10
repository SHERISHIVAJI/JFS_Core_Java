package com.dsa.regularMethod;

//import java.util.Scanner;

public class PrimeOrNot {
	public static boolean isPrime(int num) {
		if(num <= 0) return false;
		if(num <= 3) return true;
		if(num % 2 == 0) return false;
		for(int i = 3; /*i <= num/2*/ i*i <= num; i += 2)
			if(num % i  == 0) return false;
		return true;
	}
	
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter number: ");
//		int num = sc.nextInt();
		for(int i = 0; i <= 1000; i++) 
			if(isPrime(i))
				System.out.println(i);
//		sc.close();
	}
}
