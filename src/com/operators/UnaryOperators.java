package com.operators;

public class UnaryOperators {
	public static void main(String[] args) {
		int a = +10;
		boolean b = true;
		System.out.println(a);
		System.out.println(-a);
		System.out.println(a++);
		System.out.println(++a);
		System.out.println(a--);
		System.out.println(--a);
		System.out.println(~a);
		System.out.println(~(-a));
		System.out.println(!(b));
	}
}
