package com.dsa.regularMethod;

public class StrongNumber {
	public static void isStrong(int num) {
		int temp = num;
		int sum = 0;
		while(num > 0) {
			int m = num;
			int fact = 1;
			for(int i = 1; i <= m; i++) {
				fact *= i;
			}
			sum += fact;
			num /= 10;
		}
		if(sum == temp)
			System.out.println(temp);
	}
	
	public static void main(String[] args) {
		isStrong(125);
		System.out.println("iui");
	}
}
