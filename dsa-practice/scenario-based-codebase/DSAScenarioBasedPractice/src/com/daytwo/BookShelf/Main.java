package com.daytwo.BookShelf;

public class Main {

	public static void main(String[] args) {
		Library lib = new Library("Wisdom Library");

		Book b1 = new Book("The Hobbit", "J.R.R. Tolkien", Genre.Fiction, 310);
		Book b2 = new Book("1984", "George Orwell", Genre.Fiction, 328);

		lib.addBook(b1);
		lib.addBook(b2);
		User user = new User(101, "Aneek");

		boolean borrowStatus = lib.borrowBook(user, Genre.Fiction);
		System.out.println("Borrow success: " + borrowStatus);
		borrowStatus = lib.borrowBook(user, Genre.Fiction);
		System.out.println("Borrow success: " + borrowStatus);
		borrowStatus = lib.borrowBook(user, Genre.Fiction);
		System.out.println("Borrow success: " + borrowStatus);

		Book borrowedBook = user.getBook(1);
		if (borrowedBook != null) {
			System.out.println("User borrowed: " + borrowedBook.getTitle());
		}
		borrowedBook = user.getBook(2);
		if (borrowedBook != null) {
			System.out.println("User borrowed: " + borrowedBook.getTitle());
		}
		borrowedBook = user.getBook(3);
		if (borrowedBook == null) {
			System.out.println("Book not borrowed");
		}

		boolean returnStatus = lib.returnBook(user, 1);
		System.out.println("Return success: " + returnStatus);
		returnStatus = lib.returnBook(user, 1);
		System.out.println("Return success: " + returnStatus);
		returnStatus = lib.returnBook(user, 1);
		System.out.println("Return success: " + returnStatus);
	}

}
