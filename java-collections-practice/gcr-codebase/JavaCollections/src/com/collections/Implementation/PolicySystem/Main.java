package com.collections.Implementation.PolicySystem;

import java.time.LocalDate;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		PolicyManager manager = new PolicyManager();

		manager.addPolicy(new Policy("1", "Alice", LocalDate.of(2026, 2, 10), "Auto", 1200.00));
		manager.addPolicy(new Policy("2", "Bob", LocalDate.of(2025, 12, 01), "Health", 500.00));
		manager.addPolicy(new Policy("3", "Charlie", LocalDate.of(2026, 5, 20), "Home", 2500.00));
		manager.addPolicy(new Policy("4", "Diana", LocalDate.of(2026, 2, 01), "Life", 1500.00));

		manager.displayInsertionOrder();

		Policy p = manager.getByNumber("3");
		if (p != null) {
			System.out.println("Found: " + p);
		} else {
			System.out.println("Not Found");
		}

		List<Policy> expiring = manager.getExpiringSoon();
		if (expiring.isEmpty()) {
			System.out.println("No policies expiring soon.");
		} else {
			System.out.println(expiring);
		}

		manager.removeExpired();
		manager.displayInsertionOrder();
	}
}
