package com.dsa.regularMethod;

import java.util.Scanner;

public class PrintDigitsInSameOrder {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter num");
		int num=s.nextInt();
//		int res=num,count=0;
//		while(res!=0) {
//			count++;
//			res/=10;
//		}
//
//		while(count >0) {
//			System.out.println((int)(num/(Math.pow(10, --count))));
//		    num=(int)(num%(Math.pow(10, count)));
//		}
		getDigit(num);
	}

	private static void getDigit(int num) {
		if(num == 0) return;
		getDigit(num/10);
		System.out.println(num%10);		
	}
}
