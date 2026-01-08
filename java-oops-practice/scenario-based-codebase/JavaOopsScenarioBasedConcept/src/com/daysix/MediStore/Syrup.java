package com.daysix.MediStore;

import java.time.LocalDate;

public class Syrup extends Medicine {

	public Syrup(String name, double price, String expiryDate) {
		super(name, price, expiryDate);
	}

	@Override
	public boolean checkExpiry(LocalDate date) {

		if (isExpired(date)) {
			System.out.println("Syrup expired.");
			return false;
		} else {
			System.out.println("Syrup safe");
			return true;
		}
	}
}
