package com.inheritance.LibraryManagement;

public class Main {

	public static void main(String[] args) {
		Book book1 = new Author(
				"2 States", 2014, "Chetan Bhagat",
				"A graduate of IIT Delhi and IIM Ahmedabad, "
				+ "he transitioned from an investment banking career to full-time writing, "
				+ "publishing bestsellers like Five Point Someone, "
				+ "2 States, and The 3 Mistakes of My Life, "
				+ "many adapted into successful Bollywood films, "
				+ "making him a prominent figure in popular Indian literature and media"
			);

		book1.displayInfo();
	}

}
