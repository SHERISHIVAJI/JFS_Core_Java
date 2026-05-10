package com.dsa.regularMethod;

public class SumProblem {
	public static void main(String[] args) {
		int num = 12345;
		int evenSum = 0;
		int oddSum = 0;
		int temp = num;
		while(temp > 0) {
			int digit = temp%10;
			if(digit % 2 == 0) 
				evenSum += digit;
			else 
				oddSum += digit;
		}
	}
}
//even odd
//rev of a num
//palindrome
//armstrong
//sum of digits
//count of digits
//fibonacci, 
//swapping,
//strong num, 
//perfect num, 
//largets digit, 
//smallest digit, 
//sum even and odd,
//sum of squares of first n natural nums,
//sum of cubes of first n natiral nums
//check harshad number of not
//neon num or not
//spy or not
//duck num
//automarphic(curious) number
//buzz num
//sunny num
//happy num**
//remove 0's in a num
//perfect square
//perfect cube
//prime digits in a number
//check circular num is prime or not
//check increasing digits or not
//check decreasing digits or not
//check binary number
//decimal to binary - use string
//binary to decimal
//GCD HCF
//LCM
//check co-prime nums
//magic number
//auto
