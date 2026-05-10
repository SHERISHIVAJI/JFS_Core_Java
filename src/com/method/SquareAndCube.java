package com.method;

public class SquareAndCube {
	
	public static int num = 5;
	
	public static int square() {
		return num* num;
	}
	
	public static void cube() {
		System.out.println("Cube = " + square()*num);
	}

	public static void main(String[] args) {
		cube();
	}

}
