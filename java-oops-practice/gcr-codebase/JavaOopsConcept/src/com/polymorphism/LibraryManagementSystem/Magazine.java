package com.polymorphism.LibraryManagementSystem;

public class Magazine extends LibraryItem {
	public Magazine(String id, String title, String author) {
		super(id, title, author);
	}

	@Override
	public int getLoanDuration() {
		return 7;
	}

	@Override
	public void displayDetails() {
		System.out.println("Item type: Magazine");
		super.displayDetails();
	}

}
