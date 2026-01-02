package com.inheritance.BankAccount;

public class SavingsAccount extends BankAccount{
	protected double interestRate;

	 public SavingsAccount(String accountNumber, double balance, double interestRate) {
	     super(accountNumber, balance);
	     this.interestRate = interestRate;
	 }

	 @Override
	 public void displayAccountType() {
	     System.out.println("Savings Account:");
	     super.displayAccountType();
	     System.out.println("Interest Rate: " + interestRate + "%");
	 }
}
