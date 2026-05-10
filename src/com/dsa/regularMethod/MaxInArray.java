package com.dsa.regularMethod;

public class MaxInArray {
	public static void main(String[] args) {
		int[] arr = {1, 3, 2, 6, 8, 9, 6, 0, 4};
		int max = arr[0];
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] > max)
				max = arr[i];
		}
		System.out.println(max);
	}
}
