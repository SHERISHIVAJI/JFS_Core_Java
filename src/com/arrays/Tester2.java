package com.arrays;

public class Tester2 {
	public static void main(String args[]) {
		int[][] inputArray = { { 3, 2, 3, 6 }, { 2, 4 }, { 9 }, { 2, 3, 4, 2 } };
		int total = 1;

		for (int i = 0; i < inputArray.length; i++) {
			for (int j = 1; j < inputArray[i].length - 1; j++) {
				total *= inputArray[i][j];
			}
		}
		System.out.println("Result = " + total);
	}

}