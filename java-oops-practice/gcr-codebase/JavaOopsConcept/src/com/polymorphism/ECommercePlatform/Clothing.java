package com.polymorphism.ECommercePlatform;

public class Clothing extends Product implements Taxable {
	private String size;

	public Clothing(String productId, String name, double price, String size) {
		super(productId, name, price);
		this.size = size;
	}

	@Override
	public double calculateTax() {
		return getPrice() * 0.12;
	}

	@Override
	public String getTaxDetails() {
		return "GST 12% on Clothing";
	}

	@Override
	public double calculateDiscount() {
		// TODO Auto-generated method stub
		return getPrice() * .10;
	}

	@Override
	public void displayDetails() {
		double tax = calculateTax();
		double discount = calculateDiscount();
		System.out.println("Product category: Clothing");
		super.displayDetails();
		System.out.println("Tax: " + tax);
		System.out.println("Discount: " + discount);
		System.out.println("Final price: " + (this.getPrice() + tax - discount));
		System.out.println("Cloth size:" + size);
	}
}
