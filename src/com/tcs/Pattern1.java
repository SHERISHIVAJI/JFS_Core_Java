package com.tcs;
/*
 A B C
 D E F
 G H I
 */
public class Pattern1 {
	public static void main(String args[]) {
		int n = 3;
		char ch = 'A';
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				System.out.print(ch);
				ch++;
			}
			System.out.println();
		}
	}
}
