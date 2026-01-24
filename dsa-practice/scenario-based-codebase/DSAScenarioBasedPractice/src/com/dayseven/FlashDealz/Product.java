package com.dayseven.FlashDealz;

public class Product implements Comparable<Product> {
	protected String name;
	protected int discountPercent;
	protected double price;

	public Product(String name, int discountPercent, double price) {
		this.name = name;
		this.discountPercent = discountPercent;
		this.price = price;
	}

	@Override
	public int compareTo(Product o) {
		return o.discountPercent - this.discountPercent;
	}

	@Override
	public String toString() {
		return name + " | " + discountPercent + "% OFF | $" + price;
	}
}
