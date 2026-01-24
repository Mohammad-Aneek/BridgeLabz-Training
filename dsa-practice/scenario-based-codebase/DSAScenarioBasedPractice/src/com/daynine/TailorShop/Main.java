package com.daynine.TailorShop;

public class Main {
	public static void main(String[] args) {
		TailorShop shop = new TailorShop("Shimla Tailors");

		shop.addOrder(new Order(101, "Alice", "12-15-2024 10:30"));
		shop.addOrder(new Order(102, "Bob", "11-20-2024 14:00"));
		shop.addOrder(new Order(103, "Charlie", "12-01-2024 09:00"));
		shop.addOrder(new Order(104, "Diana", "11-25-2024 16:30"));

		shop.displayOrders();
	}
}
