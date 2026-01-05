package com.daythree.SwiftCart;

import java.util.*;

public class Cart implements ICheckout {
	private List<Product> items;
	private double totalPrice;

	public Cart() {
		this.items = new ArrayList<>();
		this.totalPrice = 0.0;
	}

	public Cart(List<Product> initialItems) {
		this.items = new ArrayList<>(initialItems);
		updateTotalPrice();
	}

	public void addProduct(Product p) {
		items.add(p);
		updateTotalPrice();
	}

	private void updateTotalPrice() {
		double total = 0;
		for (Product p : items) {
			total += p.getPrice();
		}
		this.totalPrice = total;
	}

	@Override
	public double applyDiscount() {
		double discountedTotal = 0;
		for (Product p : items) {
			discountedTotal += p.getDiscountedPrice();
		}
		return discountedTotal;
	}

	@Override
	public void generateBill() {
		System.out.println("------- SwiftCart Bill -------");
		for (Product p : items) {
			System.out.println("Product name: " + p.getName());
			System.out.println("Product price: " + p.getPrice());
			System.out.println("-----------------------------------");
		}

		double finalPrice = applyDiscount();
		double savings = totalPrice - finalPrice;

		System.out.println("------------------------------");
		System.out.printf("Original Total: %.2f%n",totalPrice);
		System.out.printf("Savings: %.2f%n", savings);
		System.out.printf("Final Amount to Pay: %.2f%n", finalPrice);
		System.out.println("------------------------------");
	}

}
