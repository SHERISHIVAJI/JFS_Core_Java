package com.tcs;

/*
 1 1 1
 2 2 2
 3 3 3
 
 */

public class Pattern2 {

	public static void main(String[] args) {
		int n = 3;
		int ch = 1;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				System.out.print(ch);
			}
			ch++;
			System.out.println();
		}
	}
}
