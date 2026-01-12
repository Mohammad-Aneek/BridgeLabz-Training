package com.dayseven.Artify;

public class Buyer {
	protected String name;
	protected double balance;

	public Buyer(String name, double balance) {
		this.name = name;
		this.balance = balance;
	}

	public boolean deductMoney(double amount) {
		if (amount <= balance) {
			balance -= amount;
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return name;
	}
}
