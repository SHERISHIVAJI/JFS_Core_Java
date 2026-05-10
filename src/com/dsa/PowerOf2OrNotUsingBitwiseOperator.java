package com.dsa;

import java.util.Scanner;

public class PowerOf2OrNotUsingBitwiseOperator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		boolean flag = false;
		for(int i = 0; i <= num; i++) {
			if(Math.pow(2, i) == num) {
				flag = true;
				break;
			}
		}
		if(flag)
			System.out.println("True");
		else
			System.out.println("False");
		
		sc.close();
	}
}
