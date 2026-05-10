package com.tcs;
/*
Particulate matters are the biggest contributors to Delhi pollution. The main reason behind the increase in the concentration of PMs includes vehicle emission. The government applies the Odd-Even concept for all types of vehicles: vehicles with an odd last digit in the registration number will be allowed on roads on odd dates, and those with an even last digit will be allowed on even dates.

Given an integer array a[] that contains the last digit of the registration numbers of N vehicles traveling on date D (a positive integer), the task is to calculate the total fine collected by the traffic police department from the vehicles violating the rules.

Note:
For violating the rule, vehicles will be fined X Rs.

Example 1:

Input:
4 → Value of N
{5, 2, 3, 7} → Array a[] (elements from a[0] to a[N-1])
12 → Value of D, i.e., date
200 → Value of X, i.e., fine

Output:
600 → Total fine collected

Explanation:
Date D = 12 means only even-numbered vehicles are allowed.
Vehicles with last digits 5, 3, and 7 violate the rule.
Fine collected = 3 vehicles × 200 Rs = 600.
 */
import java.util.Scanner;

public class CalculateFineForTheDay {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		int d = sc.nextInt();
		int x = sc.nextInt();
		int even = 0, odd = 0;
		for(int i : a) {
			if(i % 2 == 0)
				even++;
			else
				odd++;
		}
		if(d % 2 == 0)
			System.out.println(x * odd);
		else
			System.out.println(x * even);
		sc.close();
	}
}
