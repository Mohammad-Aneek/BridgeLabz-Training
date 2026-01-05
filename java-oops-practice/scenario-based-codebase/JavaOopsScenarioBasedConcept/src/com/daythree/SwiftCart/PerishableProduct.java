package com.daythree.SwiftCart;

public class PerishableProduct extends Product {
	public PerishableProduct(String name, double price) {
		super(name, price, "Perishable");
	}

	@Override
	public double getDiscountedPrice() {
		return this.price * 0.90;
	}
}
