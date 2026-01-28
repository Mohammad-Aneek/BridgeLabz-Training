package com.exceptions.BankSystem;

public class Main {

	public static void main(String[] args) {
		try {
			TransactionSystem.withdraw(600);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
