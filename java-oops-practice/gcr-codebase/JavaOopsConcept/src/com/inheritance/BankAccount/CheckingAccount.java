package com.inheritance.BankAccount;

public class CheckingAccount extends BankAccount{
	protected double withdrawalLimit; 

	 public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
	     super(accountNumber, balance);
	     this.withdrawalLimit = withdrawalLimit;
	 }

	 public void displayAccountType() {
	     System.out.println("Checking Account");
	     super.displayAccountType();
	     System.out.println("Withdrawl limit: " + withdrawalLimit);
	 }
}
