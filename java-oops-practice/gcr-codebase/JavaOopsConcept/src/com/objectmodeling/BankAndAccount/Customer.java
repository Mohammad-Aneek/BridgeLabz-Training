package com.objectmodeling.BankAndAccount;

import java.util.ArrayList;

class Customer {
	private String name;
	private int age;
	private ArrayList<Account> accounts;

	public Customer(String name, int age) {
		this.name = name;
		this.age = age;
		accounts = new ArrayList<Account>();
	}
	
	public void openAccount(Bank bank) {
		accounts.add(bank.openAccount(name,age));
	}
	
	public void viewBalance() {
		if (!accounts.isEmpty()) {
			System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
			for (Account account : accounts) {
				account.displayDetails();
				System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
			}
		}
	}
}
