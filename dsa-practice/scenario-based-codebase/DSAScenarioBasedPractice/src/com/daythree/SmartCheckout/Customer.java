package com.daythree.SmartCheckout;

import java.util.ArrayList;

public class Customer {
	private String name;
	protected ArrayList<Item> cart;

	protected Customer next;

	public Customer(String name) {
		this.name = name;
		this.cart = new ArrayList<Item>();
		this.next = null;

	}

	@Override
	public String toString() {
		return name + " [" + cart.size() + " items]";
	}

	protected void addItem(Item item) {
		cart.add(item);
	}
}
