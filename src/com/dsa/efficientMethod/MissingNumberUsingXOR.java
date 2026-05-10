package com.dsa.efficientMethod;

import java.util.Scanner;

public class MissingNumberUsingXOR {
	public static int missingNUmber(int[] arr) {
		int xor = 0;
		for(int i = 0; i <= arr.length; i++) 
			xor ^= i;
		for(int val : arr) {
			xor ^= val;
		}
		return xor;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		System.out.println(missingNUmber(arr));
	}
}
