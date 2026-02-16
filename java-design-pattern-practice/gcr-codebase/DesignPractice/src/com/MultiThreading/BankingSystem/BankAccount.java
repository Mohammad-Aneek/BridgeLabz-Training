package com.MultiThreading.BankingSystem;

public class BankAccount {
	private int balance = 10000;

	public void withdraw(String name, int amount) {
		System.out.println(name + " checking balance... (Current: " + balance + ")");
		if (balance >= amount) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
			}
			balance -= amount;
			System.out.println(name + " withdrew " + amount + ". Remaining: " + balance);
		} else {
			System.out.println(name + " failed: Insufficient funds.");
		}
	}
}
