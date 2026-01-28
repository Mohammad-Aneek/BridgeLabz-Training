package com.generics.OnlineMarketPlace;

public class Main {
	public static void main(String[] args) {
		Product<BookCategory> book = new Product<>("Java Generics Guide", 550.00, new BookCategory());
		Product<GadgetCategory> phone = new Product<>("Smartphone", 19999.00, new GadgetCategory());

		book.displayProduct();
		MarketPlace.applyDiscount(book, 10);
		book.displayProduct();

		System.out.println();

		phone.displayProduct();
		MarketPlace.applyDiscount(phone, 20);
		phone.displayProduct();
	}
}
