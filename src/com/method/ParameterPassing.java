package com.method;

public class ParameterPassing {
	
	public static byte add(byte num) {
		
		return num;
	}
	
	public static void main(String[] args) {
		byte num = 7;
		System.out.print(add(num));
	}

}