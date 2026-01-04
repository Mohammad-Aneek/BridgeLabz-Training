package com.polymorphism.BankingSystem;

public interface Loanable {
	void applyForLoan(double amount);

	double calculateLoanEligibility();
}
