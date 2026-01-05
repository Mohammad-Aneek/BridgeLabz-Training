package com.dayone.EWalletApplication;

public class Transaction {
	private User sender;
	private User recipient;
	private double amount;
	private Type type;

	private Transaction(User sender, User recipient, double amount, Type type) {
		this.sender = sender;
		this.recipient = recipient;
		this.amount = amount;
		this.type = type;
	}

	public enum Type {
		DEPOSIT, WITHDRAW, TRANSFER
	}

	public void display() {
		System.out.println("Transaction type: " + type);
		if (type != Type.DEPOSIT) {
			System.out.println("Sender: " + sender);
		}

		if (type != Type.WITHDRAW) {
			System.out.println("Recepient: " + recipient);
		}
		System.out.println("Amount: " + amount);
		System.out.println();
	}

	public static Transaction create(User sender, User recipient, double amount, Type type) {
		return new Transaction(sender, recipient, amount, type);
	}
}
