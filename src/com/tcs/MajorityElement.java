package com.tcs;

import java.util.*;

public class MajorityElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		Map<Integer, Integer> map = new HashMap<>();
		for(int num : arr)
			map.put(num, map.getOrDefault(num, 0) + 1);
		for(int num : arr) {
			if(map.get(num) >= n/2) {
				System.out.println(num);
				sc.close();
				return;
			}
		}
		System.out.println("-1");
		sc.close();
	}
}