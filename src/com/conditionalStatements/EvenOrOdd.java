package com.conditionalStatements;

public class EvenOrOdd {
	public boolean isEven(int num) {
		if(num % 2 == 0)
			return true;
		return false;
	}
	
	public static void main(String[] args) {
		EvenOrOdd obj = new EvenOrOdd();
		System.out.println("Is 10 Even? " + obj.isEven(10));
	}
}
