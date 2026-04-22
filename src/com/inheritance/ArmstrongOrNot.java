package com.inheritance;

import java.util.Scanner;

public class ArmstrongOrNot {
	public static boolean isArmstrong(int num) {
		int digits = 0;
		for(int i = num; i > 0; i /= 10)
			digits++;
		
		int sum = 0;
		for(int i = num; i > 0; i /= 10) {
			sum += Math.pow(i%10, digits);
		}
		return sum == num;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		
		if(isArmstrong(num))
			System.out.println(num + " is armstrong number");
		else
			System.out.println(num + " is not an armstrong number");
		
		sc.close();
	}
}
