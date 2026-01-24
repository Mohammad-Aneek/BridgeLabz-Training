package com.daynine.TailorShop;

import java.util.ArrayList;

public class TailorShop {
	private String shopName;
	private ArrayList<Order> orders;

	public TailorShop(String shopName) {
		this.shopName = shopName;
		this.orders = new ArrayList<>();
	}

	public void addOrder(Order order) {
		int idx = orders.size() - 1;

		while (idx >= 0 && orders.get(idx).compareTo(order) > 0) {
			idx--;
		}

		orders.add(idx + 1, order);
	}

	public void displayOrders() {
		System.out.println("Orders for " + shopName + ":");
		for (Order order : orders) {
			System.out.println(order);
		}
	}
}
