package com.dsa.regularMethod;

import java.util.Scanner;

public class ArmstrongOrNot {
	public static void isArmstrong(int start, int end) {
		while(start < end) {
			int num = start;
			int length = 0;
			for(int i = num; i > 0; i /= 10) {
				length++;
			}
			int sum = 0;
			while(num != 0) {
				sum += Math.pow(num%10, length);
				num /= 10;
			}
			
			if(sum == start)
				System.out.println(start);
			start++;
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter start: ");
		int start = sc.nextInt();
		System.out.println("Enter end: ");
		int end = sc.nextInt();
		isArmstrong(start, end);
		sc.close();
	}
}
