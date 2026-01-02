package com.inheritance.BankAccount;

public class FixedDepositAccount extends BankAccount{
	protected int lockInPeriod;

	 public FixedDepositAccount(String accountNumber, double balance, int lockInPeriod) {
	     super(accountNumber, balance);
	     this.lockInPeriod = lockInPeriod;
	 }

	 public void displayAccountType() {
	     System.out.println("Fixed Deposit Account:");
	     super.displayAccountType();
	     System.out.println("Lock-in Period: " + lockInPeriod + " months");
	 }
}
