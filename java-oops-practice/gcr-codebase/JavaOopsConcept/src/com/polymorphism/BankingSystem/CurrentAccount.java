package com.polymorphism.BankingSystem;

public class CurrentAccount extends BankAccount {

	public CurrentAccount(String accNum, String name, double balance) {
		super(accNum, name, balance);
	}

	@Override
	public double calculateInterest() {
		return 0;
	}

	@Override
	public double calculateLoanEligibility() {
		return balance * 5;
	}

	@Override
	protected double getInterestRate() {
		return 0;
	}

	@Override
	public void applyForLoan(double amount) {
		if (amount <= calculateLoanEligibility()) {
			System.out.println("Business Loan Approved.");
		} else {
			System.out.println("Loan Denied.");
		}
	}

	@Override
	public void displayDetails(int years) {
		System.out.println("Account type: Current Account");
		super.displayDetails(years);
	}
}
