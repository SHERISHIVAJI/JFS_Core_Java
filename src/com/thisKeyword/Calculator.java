package com.thisKeyword;

public class Calculator {
	public int num;
	Calculator(int num) {
		this.num = num;
	}
	public int sumOfDigits() {
		int sum = 0;
		while(num != 0) {
			sum += num%10;
			num /= 10;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Calculator calculator = new Calculator(123);
		System.out.println(calculator.sumOfDigits());
	}
}
