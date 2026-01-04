package com.polymorphism.LibraryManagementSystem;

public interface Reservable {
	void reserveItem(String userID);

	boolean checkAvailability();
}
