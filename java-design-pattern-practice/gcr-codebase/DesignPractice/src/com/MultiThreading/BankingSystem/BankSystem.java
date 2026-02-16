package com.MultiThreading.BankingSystem;

public class BankSystem {
	public static void main(String[] args) {
		BankAccount account = new BankAccount();

		// Creating 5 customers
		String[] names = { "Customer-1", "Customer-2", "Customer-3", "Customer-4", "Customer-5" };
		int[] amounts = { 3000, 4000, 2000, 5000, 1500 };

		for (int i = 0; i < 5; i++) {
			final int index = i;
			new Thread(() -> account.withdraw(names[index], amounts[index])).start();
		}
	}
}
