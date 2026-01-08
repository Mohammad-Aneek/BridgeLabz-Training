package com.daysix.MediStore;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

abstract class Medicine implements ISellable {

	private String name;
	private double price;
	private LocalDate expiryDate;
	private int quantity;

	public Medicine(String name, double price, String expiryDateStr) {
		this.name = name;
		this.price = price;
		this.expiryDate = LocalDate.parse(expiryDateStr, DateTimeFormatter.ofPattern("MM-dd-yyyy"));
		this.quantity = 100;
	}

	public boolean addStock(int amount) {
		if (amount > 0) {
			this.quantity += amount;
			return true;
		} else {
			return false;
		}
	}

	public double getDiscountedPrice(double discountPercent) {
		if (discountPercent > 100) {
			return this.price;
		} else {
			return this.price * (100 - discountPercent) / 100;
		}
	}

	@Override
	public double sell(int amount) {
		if (amount < 0 || amount > quantity) {
			return -1;
		} else {
			this.quantity -= amount;
			double total = amount * this.price;
			return total;
		}
	}

	public boolean isExpired(LocalDate date) {
		return date.isAfter(expiryDate);
	}
}
