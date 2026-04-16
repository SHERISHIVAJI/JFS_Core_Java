package com.inheritance;

import java.util.Scanner;

public class SwapVariablesWithoutThirdVariable {
	public static int num1;
	public static int num2;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter num1 : ");
		num1 = sc.nextInt();
		
		System.out.print("Enter num2 : ");
		num2 = sc.nextInt();
		
		System.out.println("-----Before Swapping-----");
		System.out.println("num1 = " + num1 + " and num2 = " + num2);
		
		num1 = num1 + num2 - (num2 = num1);
		
		System.out.println("-----After Swapping-----");
		System.out.println("num1 = " + num1 + " and num2 = " + num2);
		
		sc.close();
	}

}
