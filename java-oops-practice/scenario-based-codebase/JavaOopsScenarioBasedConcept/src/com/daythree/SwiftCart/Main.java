package com.daythree.SwiftCart;

public class Main {

	public static void main(String[] args) {
		Product milk = new PerishableProduct("Organic Milk", 5.00);
		Product rice = new NonPerishableProduct("Basmati Rice", 20.00);
		Product apple = new PerishableProduct("Honeycrisp Apple", 2.00);

		Cart myCart = new Cart();
		myCart.addProduct(milk);
		myCart.addProduct(rice);
		myCart.addProduct(apple);

		myCart.generateBill();

	}

}
