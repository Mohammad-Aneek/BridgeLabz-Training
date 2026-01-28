package com.exceptions.BankSystem;

public class TransactionSystem {
	static double balance = 500;

	static void withdraw(double amt) throws InsufficientBalanceException {
		if (amt < 0) {
			throw new IllegalArgumentException("Invalid amount!");
		}

		if (amt > balance) {
			throw new InsufficientBalanceException("Insufficient balance!");
		}

		balance -= amt;

		System.out.println("Withdrawal successful, new balance: " + balance);
	}
}
