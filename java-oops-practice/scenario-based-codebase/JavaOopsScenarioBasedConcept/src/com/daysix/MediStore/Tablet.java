package com.daysix.MediStore;

import java.time.LocalDate;

public class Tablet extends Medicine {

	public Tablet(String name, double price, String expiryDate) {
		super(name, price, expiryDate);
	}

	@Override
	public boolean checkExpiry(LocalDate date) {
		if (isExpired(date)) {
			System.out.println("Tablets expired.");
			return false;
		} else {
			System.out.println("Tablets safe");
			return true;
		}
	}

}
