package com.method.instance;

public class Book {
	public static String libraryName;
	public String title, author;
	
	public void displayInfo() {
		System.out.println("Library Name : " + libraryName);
		System.out.println("Book Title : " + title);
		System.out.println("Book Author : " + author);
		System.out.println("-------------------------------");
	}
	
	public static void main(String[] args) {
		libraryName = " City Public Library";
		Book book1 = new Book();
		book1.title = "The Great Gatsby";
		book1.author = "F. Scott Fitzgerald";
		book1.displayInfo();
		
		Book book2 = new Book();
		book2.title = "1984";
		book2.author = "George Orwell";
		book2.displayInfo();
	}
}
