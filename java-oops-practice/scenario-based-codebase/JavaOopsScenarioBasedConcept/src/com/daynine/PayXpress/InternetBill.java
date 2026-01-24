package com.daynine.PayXpress;

public class InternetBill extends Bill {
	public InternetBill(double amount, double penalty, String dueDate) {
		super("Internet Bill", amount, penalty, dueDate);
	}

	public InternetBill(InternetBill previousBill) {
		super(previousBill);
	}

	@Override
	public void sendReminder() {
		System.out.println("===Internet=Bill=Reminder===");
		System.out.println("Due date: " + dueDate.toString());
		System.out.println("Base amount: " + super.amount);
		System.out.println("Penalty(after due date): " + super.penalty);
	}
}
