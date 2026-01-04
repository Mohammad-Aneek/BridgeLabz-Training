package com.polymorphism.ECommercePlatform;

abstract public class Product {
	private String id;
	private String name;
	private double price;

	public Product(String id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public abstract double calculateDiscount();

	public double getPrice() {
		return price;
	}

	public void displayDetails() {
		System.out.println("Product ID: " + this.id);
		System.out.println("Product name: " + this.name);
		System.out.println("Product price: " + this.price);
	}
}
