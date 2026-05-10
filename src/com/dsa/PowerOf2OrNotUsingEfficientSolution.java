package com.dsa;

import java.util.Scanner;

public class PowerOf2OrNotUsingEfficientSolution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num > 0)
			System.out.println((num&(num - 1)) == 0);
		else
			System.out.println("false");
		sc.close();
	}
}
