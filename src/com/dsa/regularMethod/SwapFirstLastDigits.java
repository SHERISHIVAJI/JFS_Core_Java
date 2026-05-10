package com.dsa.regularMethod;

public class SwapFirstLastDigits {
	public static void main(String[] args) {
		int num = 8654;
//		int length = (num+"").length();
		int length = 0;
		int temp = num;
		while(temp > 0) {
			length++;
			temp /= 10;
		}
		System.out.println(num);
		int f = num/ (int) Math.pow(10, length-1);
		System.out.println(f);
		int m = (num%(int)Math.pow(10, length - 1))/10;
		System.out.println(m);
		int l = num %10;
		System.out.println(l);
		num = l*(int)Math.pow(10, length - 1) + m*10 + f;
		System.out.println(num);
	}
}
