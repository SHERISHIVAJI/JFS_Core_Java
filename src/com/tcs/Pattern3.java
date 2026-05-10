package com.tcs;
/*
 a b c
 a b c
 a b c
 */
public class Pattern3 {
	public static void main(String[] args) {
		int n = 3;
		
		for(int i = 0; i < n; i++) {
			char ch = 'a';
			for(int j = 0; j < n; j++) {
				System.out.print(ch);
				ch++;
			}
			
			System.out.println();
		}
	}
}
