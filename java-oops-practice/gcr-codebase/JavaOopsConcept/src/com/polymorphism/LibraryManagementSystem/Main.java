package com.polymorphism.LibraryManagementSystem;

public class Main {

	public static void main(String[] args) {
		LibraryItem book = new Book("1", "The Great Gatsby", "F. Scott Fitzgerald");
		LibraryItem magazine = new Magazine("2", "Tech Monthly", "TechWorld Inc.");
		LibraryItem dvd = new DVD("3", "Inception", "Christopher Nolan");

		System.out.println("---------------------------");
		book.displayDetails();

		System.out.println("---------------------------");
		magazine.displayDetails();

		System.out.println("---------------------------");
		dvd.displayDetails();

		book.reserveItem("Aneek");
		book.reserveItem("Abhishek");
	}

}
