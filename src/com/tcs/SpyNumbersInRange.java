package com.tcs;

public class SpyNumbersInRange {
	public static void main(String[] args) {
		int start = 100, range = 1000;
		
		while(start <= range) {
			int sum = 0, prod = 1;
			int num = start;
			while (num > 0) {
				int rem = num % 10;
				sum += rem;
				prod *= rem;
				num /= 10;
			}
			if (sum == prod)
				System.out.println(start);
			start++;
		}
	}
}
