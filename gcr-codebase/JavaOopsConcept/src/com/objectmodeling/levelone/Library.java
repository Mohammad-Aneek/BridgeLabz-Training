package com.objectmodeling.levelone;

import java.util.ArrayList;

class Library {
	String libraryName;
	ArrayList<Book> books;
	
	Library(String libraryName) {
		this.libraryName = libraryName;
		books = new ArrayList<Book>();
	}
	
	public void addBook(Book book) {
		books.add(book);
	}
	
	public void addBook(String ISBN, String title, String author, double price) {
		Book book = new Book(ISBN,title,author,price);
		books.add(book);
	}
	
	public void listBooks() {
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		for(Book b:books) {
			b.display();
			System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		}
	}
}
