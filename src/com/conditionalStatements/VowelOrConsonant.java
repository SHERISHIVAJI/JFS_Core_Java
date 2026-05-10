package com.conditionalStatements;

public class VowelOrConsonant {

	public static void main(String[] args) {
		char ch = 'e';
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
			System.out.println(ch + " is Vowel");
		else
			System.out.println(ch + " is Consonant");
	}

}
