package com.dsa.regularMethod;

//import java.util.Scanner;

public class UglyNumber {
	public static boolean isUgly(int num) {
		if(num <= 1) return false;
		int[] factors = {2, 3, 5};
		for(int factor : factors) {
			while(num % factor == 0) {
				num /= factor;
			}
		}
		return num == 1;		
	}
	
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter number: ");
//		int num = sc.nextInt();
		for(int i = 0; i <= 500; i++)
			if(isUgly(i))
				System.out.println(i);
//		sc.close();
	}
}
