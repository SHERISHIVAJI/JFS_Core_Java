package com.tcs;

import java.util.*;
public class PriorityCode {
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		String str = sc.nextLine();
		String str1[] = str.split(",");
		int n = str1.length;
		int arr[] = new int[n];
		for(int i = 0; i < n; i++)
			arr[i] = Integer.parseInt(str1[i]);
		int i = 0, j = 0, k = n -1;
		while(j <= k) {
			if(arr[j] == 1) {
				j++;
			}else if(arr[j] == 2) {
				swap(arr, j, k);
				k--;
			}else {
				swap(arr, j, i);
				i++;
				j++;
			}
		}
		for(int l = 0; l < n; l++) {
			if(l != n - 1)
				System.out.print(arr[l] + ",");
			else
				System.out.print(arr[l]);
		}
	}
}
