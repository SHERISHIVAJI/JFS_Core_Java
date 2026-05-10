package com.arrays;

public class Tester4 {
	public static void main(String[] args) {
		int sum = 0, count = 0;
		int[] sales = { 6, 9, 7, 10, 11, 9, 7, 12, 14, 15, 13, 11 };
		for (int index = 0; index < sales.length; index++) {
			sum += sales[index];
		}
		float average = (float) sum / sales.length;
		for (int sale : sales) {
			if (sale > average)
				count++;
			break;
		}
		System.out.println("Average sales: " + average);
		System.out.println("Sales above average: " + count);
	}

}