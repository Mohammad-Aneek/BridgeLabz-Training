package com.objectmodeling.BankAndAccount;

public class Bank {
	
	private String bankName;
	private String ifscCode;
	
	Bank(String bankName, String ifscCode) {
		this.bankName = bankName;
		this.ifscCode = ifscCode;
	}
	
	public void displayBankDetails() {
		System.out.println("Bank Name: " + this.bankName);
		System.out.println("IFSC code: " + this.ifscCode);
	}
	
	public Account openAccount(String name, int age) {
		Account openedAccount = new Account(name, age, this);
		return openedAccount;
	}
}