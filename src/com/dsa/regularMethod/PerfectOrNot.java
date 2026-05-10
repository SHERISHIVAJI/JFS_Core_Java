package com.dsa.regularMethod;

//import java.util.Scanner;

public class PerfectOrNot {
	public static void isPerfect(int num) {
		int sum = 0;
		for(int i = 1; i <= num/2; i++) {
			if(num % i == 0)
				sum += i;
		}
		if(sum == num)
			System.out.println(num);
//		else
//			System.out.println(false);
	}
	
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter number: ");
//		int num = sc.nextInt();
//		isPerfect(num);
		for(int i = 0; i < 1000; i++)
			isPerfect(i);
//		sc.close();
	}
}
