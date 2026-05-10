package com.method;

public class CircleAreaAndPerimeter {

	public static int radius = 5;
	
	public static void area() {
		System.out.println("Area = " + (3.14 * radius * radius));
	}
	
	public static void perimeter() {
		System.out.println("Perimeter = " + (2 * 3.14 * radius));
	}
	
	public static void main(String[] args) {
		area();
		perimeter();
	}

}
