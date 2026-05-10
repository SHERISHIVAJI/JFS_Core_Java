package com.conditionalStatements;

public class DivisibilityBy5 {
	public boolean isDivisibleBy5(int num) {
		if(num % 5 == 0)
			return true;
		return false;
	}
	
	public static void main(String[] args) {
		DivisibilityBy5 obj = new DivisibilityBy5();
		System.out.println("Is 15 divisible by 5? " + obj.isDivisibleBy5(15));
	}
}
