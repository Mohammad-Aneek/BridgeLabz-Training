package com.dayfive.BookBazaar;

abstract class Book implements IDiscountable {
	protected String title;
	protected String author;
	protected double price;
	protected int stock;

	public Book(String title, String author, double price, int stock) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.stock = stock;
	}

	public boolean sellCopy() {
		if (stock > 0) {
			stock--;
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return title + " [" + price + "]";
	}

}
