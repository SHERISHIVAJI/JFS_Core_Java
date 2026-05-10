package com.tcs;

public class ProductOfDigits {
	public static void main(String[] args) {
		int num = 2378, prod = 1;
		while(num > 0) {
			int rem = num % 10;
			prod *= rem;
			num /= 10;
		}
		System.out.println(prod);
	}
}
