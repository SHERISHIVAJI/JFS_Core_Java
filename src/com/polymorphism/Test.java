package com.polymorphism;

public class Test {
	public static void main(String[] args) {
		System.out.println("String[] rags");
		main("Shiva");
		main();
	}
	
	public static void main(String args) {
		System.out.println("String args");
	}
	
	public static void main() {
		System.out.println("No parameters");
	}
}
