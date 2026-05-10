package com.dsa;

import java.util.Scanner;

public class EvenOddWithBitwiseOperator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		if((num&1) == 0)
			System.out.println("Even");
		else if((num&1) == 1)
			System.out.println("Odd");
		else
			System.out.println("Invalid Number");
		sc.close();
	}
}
