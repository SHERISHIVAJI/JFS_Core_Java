package com.operatores;

public class Demo2 {
	/**
	 * Unary operator
	 * -------------------
	 * + -  ++ --
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {
	int i=10;
	
	
	               // 10   + 12  + 12
	System.out.println(i++ + ++i + i++);//34
	System.out.println(i);//13
	
	//                13   + 15   +   14=42
	System.out.println(i++ + ++ i + --i);
	System.out.println(i);//14 15 13 
	
	
	
	
	

	}

}
