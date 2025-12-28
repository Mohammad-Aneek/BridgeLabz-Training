package com.constructor.leveltwo;

public class SavingsAccount extends BankAccount{
	public SavingsAccount(String accountNumber, String accountHolder, double balance) {
        // Call the parent constructor to set the base properties
        super(accountNumber, accountHolder, balance);
    }

    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Current Balance: Rs." + getBalance());
    }
}
