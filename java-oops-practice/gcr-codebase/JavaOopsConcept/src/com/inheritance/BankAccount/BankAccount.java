package com.inheritance.BankAccount;

public class BankAccount {
	protected String accountNumber;
	protected double balance;
	
	public BankAccount(String accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public void displayAccountType() {
		System.out.println("Account number: " + accountNumber);
		System.out.println("Balance: " + balance);
	}
}
