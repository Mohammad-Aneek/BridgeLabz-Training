package com.polymorphism.LibraryManagementSystem;

public class Book extends LibraryItem {
	public Book(String id, String title, String author) {
		super(id, title, author);
	}

	@Override
	public int getLoanDuration() {
		return 21;
	}

	@Override
	public void displayDetails() {
		System.out.println("Item type: Book");
		super.displayDetails();
	}

}
