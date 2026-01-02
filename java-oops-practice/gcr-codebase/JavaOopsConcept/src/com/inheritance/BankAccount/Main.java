package com.inheritance.BankAccount;

public class Main {

	public static void main(String[] args) {
		SavingsAccount savings = new SavingsAccount("1", 10000, 4.5);
		CheckingAccount checking = new CheckingAccount("2", 15000, 5000);
		FixedDepositAccount fd = new FixedDepositAccount("3", 50000, 12);

		savings.displayAccountType();
		checking.displayAccountType();
		fd.displayAccountType();
	}

}
