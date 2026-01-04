package com.polymorphism.BankingSystem;

public abstract class BankAccount implements Loanable {
	private String accountNumber;
	private String holderName;
	protected double balance;

	public BankAccount(String accountNumber, String holderName, double balance) {
		this.accountNumber = accountNumber;
		this.holderName = holderName;
		this.balance = balance;
	}

	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
		} else {
			System.out.println("Invalid amount");
		}
	}

	public void withdraw(double amount) {
		if (amount < 0) {
			System.out.println("Invalid amount");
		} else if (balance >= amount) {
			balance -= amount;
		} else {
			System.out.println("Insufficient funds in " + accountNumber);
		}
	}

	protected abstract double getInterestRate();

	public abstract double calculateInterest();

	public void displayDetails(int years) {
		double interest = calculateInterest() * years;
		double eligibility = calculateLoanEligibility();

		System.out.println("Account holder name: " + holderName);
		System.out.println("Account number: " + accountNumber);
		System.out.println("Current Balance: " + balance);
		System.out.println("Interest Rate: " + getInterestRate() + "%");
		System.out.println("Interest Earned :" + interest);
		System.out.println("Max Loan Eligibility: " + eligibility);
	}

}
