package com.tcs;

import java.util.Scanner;

public class TransposeOfMatrix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		int arr[][] = new int[r][c];
		for(int i = 0; i < r; i++)
			for(int j = 0; j < c; j++)
				arr[i][j] = sc.nextInt();
		int transpose[][] = new int[c][r];
		for(int i = 0; i < r; i++)
			for(int j = 0; j < c; j++)
				transpose[j][i] = arr[i][j];
		System.out.println("The Transpose Matrix is: ");
		for(int i = 0; i < c; i++) {
			for(int j = 0; j < r; j++)
				System.out.print(transpose[i][j] + " ");
			System.out.println();
		}
	}
}
