package com.dsa.regularMethod;

public class SecondMaxInArray {
	public static void main(String[] args) {
		int[] arr = {1, 3, 2, 6, 9, 6, 8, 0,7, 4};
		int max = arr[0];
		int secondMax = max;
//		int thirdMax = max;
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] > max) {
				secondMax = max;
				max = arr[i];
			} else if (secondMax != max && arr[i] > secondMax) {
//				thirdMax = secondMax;
				secondMax = arr[i];
			} /*else if (thirdMax > secondMax && thirdMax > max && arr[i] > thirdMax) {
				thirdMax = secondMax;
				secondMax = arr[i];
			}*/
		}
		
		System.out.println(max);
		System.out.println(secondMax);
//		System.out.println(thirdMax);
	}
}
