package com.method;

public class Book {
	String bookTitle;
	String author;
	long isbn;
	
	public void addBookDetails(String title, String auth, long id) {
		bookTitle = title;
		author = auth;
		isbn = id;
	}
	
	public String displayDetails() {
		return "Book Title : " + bookTitle + "\nAutho : " + author + "\nISBN : " + isbn;
	}
	
	public static void main(String[] args) {
		Book book = new Book();
		book.addBookDetails("Wings of Fire", "A. P. J. Abdul Kalam", 9788173711466L);
		System.out.println(book.displayDetails());

	}

}