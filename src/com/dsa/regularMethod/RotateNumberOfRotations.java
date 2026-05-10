package com.dsa.regularMethod;

public class RotateNumberOfRotations {
	public static void main(String[] args) {
		int num = 345678;
		int numOfRotations = -98;
//		int digit = (num+"").length();
		int digit = 0;
		int temp = num;
		while (temp > 0) {
			digit++;
			temp /= 10;
		}

		numOfRotations %= digit;
		if (numOfRotations < 0)
			numOfRotations += digit;
		int rem = num % (int) Math.pow(10, numOfRotations);
		int q = num / (int) Math.pow(10, numOfRotations);
		num = rem * (int) Math.pow(10, digit - numOfRotations) + q;
		System.out.println(num);
	}
}
