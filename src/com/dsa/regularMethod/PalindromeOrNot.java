package com.dsa.regularMethod;

import java.util.Scanner;

public class PalindromeOrNot {
	public static void isPalindrome(int start,int end) {
		while(start <= end) {
			int num = start;
			int rev = 0;
			while(num > 0) {
				rev = rev * 10 + num%10;
				num /= 10;
			}
			if(rev == start)
				System.out.println(start);
			start++;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter start: ");
		int start = sc.nextInt();
		System.out.println("Enter end: ");
		int end = sc.nextInt();
		isPalindrome(start, end);
		sc.close();
	}
}
