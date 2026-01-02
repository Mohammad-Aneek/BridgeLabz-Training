package com.objectmodeling.BankAndAccount;

class Account {
	private String accountHolderName;
	private int accountHolderAge;
	private String accountNumber;
	private double accountBalance;
	private Bank bank;
	
	Account(String accountHolderName, int accountHolderAge, Bank bank) {
		this.accountHolderName = accountHolderName;
		this.accountHolderAge = accountHolderAge;
		this.accountNumber = "" + (long)(Math.random()*9000000000l + 1000000000l);
		this.accountBalance = 0;
		this.bank = bank;
	}
	
	public void displayDetails() {
		System.out.println("Account Holder Name: " + this.accountHolderName);
		System.out.println("Account Number: " + this.accountNumber);
		System.out.println("Account Balance: " + this.accountBalance);
		bank.displayBankDetails();
	}
}