package com.dsa.regularMethod;

public class NumbersWithEvenNumberOfDigits {
	public static void main(String[] args) {
		int[] nums = {12,345,2,6,7896};
		int count = 0;
        for (int num : nums) {
            int digit = String.valueOf(num).length();
            
            if ((digit & 1) == 0)
                count++;
        }
        System.out.println(count);
	}
}
