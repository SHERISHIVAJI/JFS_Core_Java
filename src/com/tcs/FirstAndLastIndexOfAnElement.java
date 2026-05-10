package com.tcs;

import java.util.Scanner;

public class FirstAndLastIndexOfAnElement {
	public static int getFirst(int[] arr, int target, int n) {
		int l = 0, h = n - 1;
		int res = -1;
		while(l <= h) {
			int mid = (l + h) / 2;
			if(arr[mid] == target) {
				res = mid;
				h = mid - 1;
			}
			else if(arr[mid] < target)
				l = mid + 1;
			else
				h = mid - 1;				
		}
		return res;
	}
	
	public static int getLast(int[] arr, int target, int n) {
		int l = 0, h = n - 1;
		int res = -1;
		while(l <= h) {
			int mid = (l + h) / 2;
			if(arr[mid] == target) {
				res = mid;
				l = mid + 1;
			}
			else if(arr[mid] < target)
				l = mid + 1;
			else
				h = mid - 1;				
		}
		return res;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		
		int target = sc.nextInt();
		
		int first = getFirst(arr, target, n);
		int last = getLast(arr, target, n);
		
		System.out.println("First: " + first + ", Last: " + last);
	}
}
