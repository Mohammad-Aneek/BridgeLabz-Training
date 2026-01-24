package com.daysix.SmartLibrary;

public class Main {
	public static void main(String[] args) {
		Library kiosk = new Library();

		kiosk.borrowBook("Harry Potter");
		kiosk.borrowBook("The Great Gatsby");
		kiosk.borrowBook("A Tale of Two Cities");
		kiosk.borrowBook("Don Quixote");
		kiosk.borrowBook("Catch-22");

		kiosk.display();
	}
}