package com.dayone.EWalletApplication;

import java.util.ArrayList;

abstract class Wallet implements Transferrable {
	private double balance;
	private User owner;
	private ArrayList<Transaction> transactionHistory;

	public Wallet(double amount, User owner) {
		this(amount, owner, false);
	}

	public Wallet(double amount, User owner, boolean referralBonus) {
		this.owner = owner;
		this.transactionHistory = new ArrayList<Transaction>();

		if (referralBonus) {
			amount += amount * .2;
		}

		this.deposit(amount);
		owner.setWallet(this);
	}

	protected User getOwner() {
		return this.owner;
	}
	
	protected boolean deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			transactionHistory.add(Transaction.create(null, owner, amount, Transaction.Type.DEPOSIT));
			return true;
		} else {
			return false;
		}
	}

	protected boolean withdraw(double amount) {
		if (balance >= amount) {
			balance -= amount;
			transactionHistory.add(Transaction.create(owner, null, amount, Transaction.Type.WITHDRAW));
			return true;
		} else {
			return false;
		}
	}

	protected boolean transfer(User recepient, double amount) {
		if (amount > balance) {
			return false;
		} else {
			balance -= amount;
			transactionHistory.add(Transaction.create(owner, recepient, amount, Transaction.Type.TRANSFER));
			return true;
		}
	}

	protected void printHistory() {
		System.out.println("Transcation history");
		System.out.println();
		for (Transaction transaction : transactionHistory) {
			transaction.display();
		}
		System.out.println("----------------------------------------------");
	}
	
	abstract boolean transferTo(Wallet receiverWallet, double amount);
}
