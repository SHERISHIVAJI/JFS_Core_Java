package com.dsa.regularMethod;

import java.util.Arrays;

public class NullMatrixOrNot {
	public static void main(String[] args) {
		int[][] a = {{0,0,0}, {0,0,0}, {0,0,0}};
		
		if(a.length != a[0].length) {
			System.out.println("Array is not a square matrix");
			return;
		}
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[0].length; j++) {
				if(a[i][j] != 0) {
					System.out.println("Not a null matrix");
					return;
				}
			}
		}
		System.out.println("Null matrix");
		System.out.println(Arrays.deepToString(a));
	}
}
