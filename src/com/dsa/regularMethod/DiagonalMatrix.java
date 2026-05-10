package com.dsa.regularMethod;

import java.util.Arrays;

public class DiagonalMatrix {
	public static void main(String[] args) {
		int[][] a = {{1, 0, 0}, {0, 2, 0}, {0, 0, 3}};
		
		if(a.length != a[0].length) {
			System.out.println("Array is not a square matrix");
			return;
		}
		
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[0].length; j++) {
				if(i != j) {
					if(a[i][j] != 0) {
						System.out.println("Not a Diagonal Matrix");
						return;
					}
				}
			}
		}
		System.out.println("Diagonal Matrix");
		System.out.println(Arrays.deepToString(a));
	}
}
