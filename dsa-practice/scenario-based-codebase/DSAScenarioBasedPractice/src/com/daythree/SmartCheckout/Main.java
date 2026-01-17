package com.daythree.SmartCheckout;

public class Main {
	public static void main(String[] args) {
		CheckoutCounter counter = new CheckoutCounter("D-Mart counter 1");

		Customer c1 = new Customer("Aneek");
		Customer c2 = new Customer("Ansh");
		Customer c3 = new Customer("Abhishek");

		counter.addItem(c1, Item.MILK);
		counter.addItem(c1, Item.BREAD);

		counter.addItem(c2, Item.RICE);
		counter.addItem(c2, Item.MILK);
		counter.addItem(c2, Item.MILK);

		counter.addItem(c3, Item.MILK);

		counter.addCustomer(c1);
		counter.addCustomer(c2);
		counter.addCustomer(c3);

		counter.checkout();
		counter.checkout();
		counter.checkout();
		counter.checkout();
	}
}
