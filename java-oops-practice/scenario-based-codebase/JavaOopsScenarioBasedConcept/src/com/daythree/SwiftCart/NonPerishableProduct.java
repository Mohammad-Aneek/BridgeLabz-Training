package com.daythree.SwiftCart;

public class NonPerishableProduct extends Product {
	public NonPerishableProduct(String name, double price) {
        super(name, price, "Non-Perishable");
    }

    @Override
    public double getDiscountedPrice() {
        return this.price * 0.95;
    }
}
