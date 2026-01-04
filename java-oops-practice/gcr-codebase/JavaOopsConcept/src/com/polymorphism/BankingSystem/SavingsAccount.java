package com.polymorphism.BankingSystem;

public class SavingsAccount extends BankAccount {
	private final double INTEREST_RATE = .04;

	public SavingsAccount(String accNum, String name, double balance) {
		super(accNum, name, balance);
	}

	@Override
	public void applyForLoan(double amount) {
		if (amount <= calculateLoanEligibility()) {
			System.out.println("Loan Approved for Savings Account.");
		} else {
			System.out.println("Loan Denied. Amount exceeds limit.");
		}
	}

	@Override
	public double calculateLoanEligibility() {
		return balance * 3;
	}

	@Override
	protected double getInterestRate() {
		return INTEREST_RATE;
	}

	@Override
	public double calculateInterest() {
		return balance * INTEREST_RATE;
	}

	@Override
	public void displayDetails(int years) {
		System.out.println("Account type: Savings Account");
		super.displayDetails(years);
	}
}
