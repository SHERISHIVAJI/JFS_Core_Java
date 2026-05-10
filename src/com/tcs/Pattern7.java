package com.tcs;
/*
 1
 2 3
 4 5 6
 */
public class Pattern7 {
	public static void main(String[] args) {
		int n = 3;
		int ch = 1;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print(ch);
				ch++;
			}
			System.out.println();
		}
	}
}
