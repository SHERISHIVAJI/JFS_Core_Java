package com.staticKeyword;

class Count {
	static int count = 0;
	
	Count() {
		count++;
		System.out.println(count);
	}
}

public class Counter {
	public static void main(String[] args) {
		Count c1 = new Count();
		Count c2 = new Count();
		Count c3 = new Count();
	}
}
