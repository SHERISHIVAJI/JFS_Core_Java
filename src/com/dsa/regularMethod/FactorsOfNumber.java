package com.dsa.regularMethod;

public class FactorsOfNumber {
	public static void main(String[] args) {
		int num  = 7654;
		int count = 0;
		int sum = 0;
		for(int i = 1; i <= num; i++) {
			if(num%i == 0) {
				System.out.println(i);
				count++;
				sum += i;
			}
		}
		System.out.println(count);
		System.out.println(sum);
	}
}
