package com.daytwo.MyBank;

public class CurrentAccount extends Account {
	public CurrentAccount(String accountNumber, double balance) {
		super(accountNumber, balance);
	}

	@Override
	public void calculateInterest() {
		System.out.println("Current accounts do not accrue interest.");
	}

}
