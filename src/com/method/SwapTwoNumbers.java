package com.method;

public class SwapTwoNumbers {
	
	public static int x = 10, y =20;
	
	public static void swap() {
		int a = x, b = y;
		int temp = a;
		a  = b;
		b = temp;
		System.out.println("x = " + a + ", y = " + b);
	}

	public static void main(String[] args) {
		swap();
	}

}
