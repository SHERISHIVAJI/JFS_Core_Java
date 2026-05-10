package com.dsa.regularMethod;

import java.util.Arrays;
import java.util.Scanner;

public class FirstUnique {
	public static char uniqueCharacter(String str) {
		boolean arr[] = new boolean[str.length()];
		for(int i = 0; i < str.length(); i++) {
			if(arr[i] == true)
				continue;
			int count = 0;
			for(int j = 0; j < str.length(); j++) {
				if(str.charAt(i) == str.charAt(j)) {
					count++;
					arr[j] = true;
					System.out.println(Arrays.toString(arr));
				}
			}
			System.out.println("Frequency of " + str.charAt(i) + " --> " + count);
//			if(count == 1)
//				return str.charAt(i);			
		}
		return 0;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("String: ");
		String str = sc.nextLine();
		System.out.println(uniqueCharacter(str));
	}
}
