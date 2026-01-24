package com.daynine.PayXpress;

public class ElectricityBill extends Bill {

	public ElectricityBill(double amount, double penalty, String dueDate) {
		super("Electricity Bill", amount, penalty, dueDate);
	}

	public ElectricityBill(ElectricityBill previousBill) {
		super(previousBill);
	}

	@Override
	public void sendReminder() {
		System.out.println("===Electricity=Bill=Reminder===");
		System.out.println("Due date: " + dueDate.toString());
		System.out.println("Base amount: " + super.amount);
		System.out.println("Penalty(after due date): " + super.penalty);
	}

}
