package com.loopingStatements;

public class MiddleCharactersInString {
	public static void main(String[] args) {
		String str = "SHIVAJI";
		int len = str.length();
		int i = 0;
		while(i < len) {
			if(len % 2 == 0) {
				if(i == len / 2 - 1 || i == len / 2)
					System.out.print(str.charAt(i));
			} else {
				if(i == len / 2)
					System.out.print(str.charAt(i));
			}
			i++;
		}
	}
}
