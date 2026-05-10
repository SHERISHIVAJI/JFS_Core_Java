package com.dsa.regularMethod;

import java.util.Arrays;

public class MissingNumber {
	public static int missingNumber(int[] arr) {
		Arrays.sort(arr);
		for(int i = 1; i < arr.length; i++) {
			if(arr[i-1] != arr[i]-1)
				return arr[i] - 1;
		}
		return arr.length;
	}
	public static void main(String[] args) {
		int[] arr = {3, 0, 1, 2};
		System.out.println(missingNumber(arr));
	}
}
