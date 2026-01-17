package com.daythree.SmartCheckout;

import java.util.ArrayList;
import java.util.HashMap;

public class CheckoutCounter {
	private String name;
	private Customer queueHead;
	private Customer queueTail;

	private HashMap<Item, Double> prices;
	private HashMap<Item, Integer> stock;

	public CheckoutCounter(String name) {
		this.name = name;

		this.queueHead = null;
		this.queueTail = null;

		this.prices = new HashMap<Item, Double>();
		this.stock = new HashMap<Item, Integer>();

		Item[] arr = { Item.MILK, Item.BREAD, Item.EGG, Item.APPLE, Item.BANANA, Item.TOMATO, Item.ONION, Item.RICE,
				Item.SOAP };
		for (Item item : arr) {
			prices.put(item, Math.random() * 100 + 100);
			stock.put(item, 3);
		}
	}

	public void addCustomer(Customer customer) {
		if (queueHead == null) {
			queueHead = queueTail = customer;
		} else {
			queueTail.next = customer;
			queueTail = queueTail.next;
		}
	}

	public void checkout() {
		if (queueHead == null) {
			System.out.println("Queue is empty");
		} else {
			ArrayList<Item> items = queueHead.cart;
			String name = queueHead.toString();
			queueHead = queueHead.next;

			if (queueHead == null) {
				queueTail = null;
			}
			double total = 0;
			for (Item item : items) {
				total += prices.get(item);
			}

			System.out.printf("Total for %s: %.2f%n", name, total);
		}
	}

	public boolean addItem(Customer customer, Item item) {
		int quantity = stock.get(item);
		if (quantity > 0) {
			customer.addItem(item);
			stock.put(item, quantity - 1);
			return true;
		} else {
			return false;
		}
	}

}
