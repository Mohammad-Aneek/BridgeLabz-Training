package com.polymorphism.LibraryManagementSystem;

abstract class LibraryItem implements Reservable {
	private String itemId;
	private String title;
	private String author;
	private String reservedByUserID;

	public LibraryItem(String itemId, String title, String author) {
		this.itemId = itemId;
		this.title = title;
		this.author = author;
		this.reservedByUserID = null;
	}

	public abstract int getLoanDuration();

	public void displayDetails() {
		System.out.println("Item ID: " + itemId);
		System.out.println("Item title: " + title);
		System.out.println("Author: " + author);
		if (checkAvailability()) {
			System.out.println("Loan Duration: " + getLoanDuration() + " days");
		}
		System.out.println("Status: " + (checkAvailability() ? "Available" : "Reserved"));
	}

	@Override
	public void reserveItem(String userID) {
		if (checkAvailability()) {
			this.reservedByUserID = userID;
			System.out.println("Item reserved successfully.");
		} else {
			System.out.println("Reservation failed. Item already reserved.");
		}
	}

	@Override
	public boolean checkAvailability() {
		return reservedByUserID == null;
	}

}
