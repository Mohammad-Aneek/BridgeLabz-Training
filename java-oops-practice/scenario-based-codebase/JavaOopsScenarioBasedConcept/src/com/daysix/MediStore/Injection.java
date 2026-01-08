package com.daysix.MediStore;

import java.time.LocalDate;

public class Injection extends Medicine {

	public Injection(String name, double price, String expiryDate) {
		super(name, price, expiryDate);
	}

	@Override
	public boolean checkExpiry(LocalDate date) {

		if (isExpired(date)) {
			System.out.println("Injection expired.");
			return false;
		} else {
			System.out.println("Injection safe");
			return true;
		}
	}

}
