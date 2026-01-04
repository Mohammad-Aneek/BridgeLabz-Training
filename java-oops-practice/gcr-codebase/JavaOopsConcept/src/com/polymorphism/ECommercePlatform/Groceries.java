package com.polymorphism.ECommercePlatform;

public class Groceries extends Product implements Taxable {
	private String expiryDate;

	public Groceries(String productId, String name, double price, String expiryDate) {
		super(productId, name, price);
		this.expiryDate = expiryDate;
	}

	@Override
	public double calculateDiscount() {
		return getPrice() * .20;
	}

	@Override
	public double calculateTax() {
		return getPrice() * .05;
	}

	@Override
	public String getTaxDetails() {
		return "GST 5% on Groceries";
	}

	@Override
	public void displayDetails() {
		double tax = calculateTax();
		double discount = calculateDiscount();
		System.out.println("Product category: Groceries");
		super.displayDetails();
		System.out.println("Tax: " + tax);
		System.out.println("Discount: " + discount);
		System.out.println("Final price: " + (this.getPrice() + tax - discount));
		System.out.println("Expiry date:" + expiryDate);
	}
}
