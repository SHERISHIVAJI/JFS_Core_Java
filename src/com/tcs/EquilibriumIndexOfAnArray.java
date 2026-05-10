package com.tcs;

import java.util.Scanner;

public class EquilibriumIndexOfAnArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int total = 0;
		for(int i = 0; i < n; i++) 
			total += arr[i];
		int leftSum = arr[0];
		for(int i = 1; i < n - 1; i++) {
			if(leftSum == total - arr[i] - leftSum) {
				System.out.println(i);
				return;
			}
			leftSum += arr[i];
		}
		System.out.println("-1");
		
	}
}
