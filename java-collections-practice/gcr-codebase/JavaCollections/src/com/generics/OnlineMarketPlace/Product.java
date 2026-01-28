package com.generics.OnlineMarketPlace;

public class Product<T extends Category> {
	private String name;
	private double price;
	private double discountedPrice;
	private T category;

	public Product(String name, double price, T category) {
		this.name = name;
		this.discountedPrice = this.price = price;
		this.category = category;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getDiscountedPrice() {
		return discountedPrice;
	}

	public void setDiscountedPrice(double discountedPrice) {
		this.discountedPrice = discountedPrice;
	}

	public void displayProduct() {
		System.out.println("Product: " + name);
		System.out.println("Category: " + category.getCategoryName());
		System.out.println("Price: " + price);
		if (price != discountedPrice) {
			System.out.println("Discounted price: " + discountedPrice);
		}
	}
}
