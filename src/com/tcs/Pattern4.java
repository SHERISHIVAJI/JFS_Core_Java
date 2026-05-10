package com.tcs;
/*
 z y x
 w v u
 t s r
 */
public class Pattern4 {
	public static void main(String[] args) {
		int n = 3;
		char ch = 'z';
		for(int i = 0; i < n; i++) {
			
			for(int j = 0; j < n; j++) {
				System.out.print(ch);
				ch--;
			}
			
			System.out.println();
		}
	}
}
