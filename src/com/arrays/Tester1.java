package com.arrays;

public class Tester1 {
	public static void main(String s[]) {
		int a[] = { 12, 15, 16, 17, 19, 23 };
		for (int i = a.length - 1; i > 0; i--) {
			if (i % 3 != 0) {
				--i;
			}
			System.out.println(a[i]);
		}
	}

}