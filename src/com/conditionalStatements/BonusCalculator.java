package com.conditionalStatements;

public class BonusCalculator {
	public double calculateBonus(int experience, int rating, double salary) {
		if(experience > 5 && rating > 9)
			return salary*0.5;
		else if((experience > 3 && experience <= 5) && (rating > 7 && rating <= 9))
			return salary*0.3;
		else if((experience > 1 && experience <= 3) && (rating > 5 && rating <= 7))
			return salary*0.1;
		else
			return 0;
	}
	
	public static void main(String[] args) {
		BonusCalculator bc = new BonusCalculator();
		System.out.println("Salary Incremented upto : " + bc.calculateBonus(6, 12, 89000));
	}
}
