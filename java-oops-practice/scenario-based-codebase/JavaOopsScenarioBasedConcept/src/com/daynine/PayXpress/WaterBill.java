package com.daynine.PayXpress;

public class WaterBill extends Bill {
	public WaterBill(double amount, double penalty, String dueDate) {
		super("Water Bill", amount, penalty, dueDate);
	}

	public WaterBill(WaterBill previousBill) {
		super(previousBill);
	}

	@Override
	public void sendReminder() {
		System.out.println("===Water=Bill=Reminder===");
		System.out.println("Due date: " + dueDate.toString());
		System.out.println("Base amount: " + super.amount);
		System.out.println("Penalty(after due date): " + super.penalty);
	}

}
