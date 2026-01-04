package com.polymorphism.LibraryManagementSystem;

public class DVD extends LibraryItem {

	public DVD(String id, String title, String director) {
		super(id, title, director);
	}

	@Override
	public int getLoanDuration() {
		return 3;
	}

	@Override
	public void displayDetails() {
		System.out.println("Item type: DVD");
		super.displayDetails();
	}

}
