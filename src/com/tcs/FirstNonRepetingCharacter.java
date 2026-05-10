package com.tcs;

import java.util.*;

public class FirstNonRepetingCharacter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int n = str.length();
		HashMap<Character, Integer> map = new HashMap<>();
		for(int i = 0; i < str.length(); i++) {
			map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
		}
		
		for(char ch : str.toCharArray()) {
			if(map.get(ch) == 1) {
				System.out.println(ch);
				return;
			}
		}
		
		System.out.println("-1");
	}
}
