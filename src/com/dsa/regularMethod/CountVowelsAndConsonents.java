package com.dsa.regularMethod;

import java.util.Scanner;

public class CountVowelsAndConsonents {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your string: ");
		String str = sc.next();
		int vowel = 0, cons = 0;
		for(int i = 0; i < str.length(); i++ ) {
			if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' || str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U')
				vowel++;
			else
				cons++;
		}
		System.out.println("Number of Vowels: " + vowel);
		System.out.println("Number of Consonents: " + cons);
		
		sc.close();
	}
}
