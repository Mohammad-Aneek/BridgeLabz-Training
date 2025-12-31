package com.objectmodeling.levelone;

public class LibraryBookTest {

	public static void main(String[] args) {
		Book b1 = new Book("978-8183331630", "Let Us C", "Yashavant Kanetkar", 350.00);
		Book b2 = new Book("978-9389845006", "Let Us Python", "Yashavant Kanetkar", 400.00);
		Book b3 = new Book("978-0070635555", "OOPs with Java", "E. Balagurusamy", 550.00);
		
		Library wisdomLib = new Library("Wisdom Library");
		Library cityLib = new Library("City Central");
		
		wisdomLib.addBook(b1); 
		wisdomLib.addBook(b2); 
		
		cityLib.addBook(b1); 
		cityLib.addBook(b3);

		System.out.println(wisdomLib.libraryName + " Collection ");
		wisdomLib.listBooks();
		
		System.out.println(cityLib.libraryName + " Collection");
		cityLib.listBooks();

	}
}
