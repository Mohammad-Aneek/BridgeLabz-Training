package com.polymorphism.BankingSystem;

public class Main {

	public static void main(String[] args) {
		BankAccount savings = new SavingsAccount("1", "Abhishek", 5000);
		BankAccount current = new CurrentAccount("2", "Aneek", 20000);

		System.out.println("----------------------------");
		savings.displayDetails(5);
		savings.applyForLoan(10000);

		System.out.println("----------------------------");
		current.displayDetails(5);
		current.applyForLoan(150000);
	}

}
