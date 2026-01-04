package com.polymorphism.ECommercePlatform;

public class Electronics extends Product implements Taxable {
	private int warrantyPeriod;

	public Electronics(String productId, String name, double price, int warrantyPeriod) {
		super(productId, name, price);
		this.warrantyPeriod = warrantyPeriod;
	}

	@Override
	public double calculateDiscount() {
		// TODO Auto-generated method stub
		return getPrice() * .10;
	}

	@Override
	public double calculateTax() {
		return getPrice() * .18;
	}

	@Override
	public String getTaxDetails() {
		return "GST 18% on Electronics";
	}

	@Override
	public void displayDetails() {
		double tax = calculateTax();
		double discount = calculateDiscount();
		System.out.println("Product category: Electronics");
		super.displayDetails();
		System.out.println("Tax: " + tax);
		System.out.println("Discount: " + discount);
		System.out.println("Final price: " + (this.getPrice() + tax - discount));
		System.out.println("Warranty Period (in months):" + warrantyPeriod);
	}
}
