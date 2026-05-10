package com.tcs.numbers;

import java.util.Scanner;

public class DivisibleBy11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int num = sc.nextInt();
		int temp = num;
		
		int oddSum = 0, evenSum = 0, position = 1;
		
		while(temp > 0) {
			int rem = temp % 10;
			if(position % 2 == 1)
				oddSum += rem;
			else
				evenSum += rem;
			temp /= 10;
			position++;
		}
		int diff = evenSum - oddSum;
		
		if(diff % 11 == 0)
			System.out.println(num + " is divisible by 11");
		else
			System.out.println(num + " is not divisible by 11");
		sc.close();
	}
}
