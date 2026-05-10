package com.infosysSample;

import java.util.Scanner;

public class MSSWithSwaps {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++) a[i] = sc.nextInt();
		
		System.out.println(maxMSS(a, k));
		sc.close();
	}

	private static int maxMSS(int[] a, int k) {
		int n = a.length;
		int result = kadane(a);
		return 0;
	}

	private static int kadane(int[] a) {
		int maxSum = a[0];
		int curr = a[0];
		
		for(int i = 1; i < a.length; i++) {
			curr = Math.max(a[i], curr + a[i]);
		}
		return 0;
	}
}
