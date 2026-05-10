package com.tcs;

public class SpyOrNot {
	public static void main(String[] args) {
		int num = 2378, sum = 0, prod = 1;
		while(num > 0) {
			int rem = num % 10;
			sum += rem;
			prod *= rem;
			num /= 10;
		}
		System.out.println(sum);
		System.out.println(prod);
		if(sum == prod)
			System.out.println("Spy");
		else
			System.out.println("Not Spy");
	}
}
