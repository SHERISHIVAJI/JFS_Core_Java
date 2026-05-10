package com.tcs;

public class PalindromOrNot {
	public static void main(String[] args) {
		int num = 2378, rev = 0;
		int temp = num;
		while(num > 0) {
			int rem = num % 10;
			rev = rev*10 + rem;
			num /= 10;
		}
		System.out.println(temp);
		System.out.println(rev);
		if(temp == rev)
			System.out.println("Palindrom");
		else
			System.out.println("Not a palindrom");
	}
}
