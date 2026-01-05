package com.daytwo.MyBank;

abstract class Account implements ITransaction {
	protected String accountNumber;
	private double balance;

	public Account(String accountNumber) {
		this.accountNumber = accountNumber;
		this.balance = 0.0;
	}

	public Account(String accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	@Override
	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println("Deposited: " + amount);
		}
	}

	@Override
	public void withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
			System.out.println("Withdrawn: " + amount);
		} else {
			System.out.println("Insufficient funds or invalid amount.");
		}
	}

	@Override
	public double checkBalance() {
		return this.balance;
	}

	protected void updateBalance(double newBalance) {
		this.balance = newBalance;
	}

	public abstract void calculateInterest();

}
