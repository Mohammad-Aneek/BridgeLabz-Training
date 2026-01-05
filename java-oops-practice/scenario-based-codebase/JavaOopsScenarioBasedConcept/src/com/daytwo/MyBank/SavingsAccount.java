package com.daytwo.MyBank;

public class SavingsAccount extends Account {
	private double interestRate;

	public SavingsAccount(String accountNumber, double balance, double interestRate) {
		super(accountNumber, balance);
		this.interestRate = interestRate;
	}

	@Override
	public void calculateInterest() {
		double interest = checkBalance() * interestRate / 100;
		updateBalance(checkBalance() + interest);
		System.out.println("Interest added: " + interest);
	}

}
