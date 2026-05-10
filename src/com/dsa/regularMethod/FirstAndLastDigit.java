package com.dsa.regularMethod;

public class FirstAndLastDigit {
	public static void main(String[] args) {
		int num = 78654;
		System.out.println(num/(int)Math.pow(10, (num+"").length() - 1));
		System.out.println(num%10);
	}
}
