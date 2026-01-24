package com.daynine.PayXpress;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Bill implements IPayable {
	protected String type;
	protected double amount;
	protected double penalty;
	protected LocalDate dueDate;
	protected boolean paid;

	public Bill(String type, double amount, double penalty, String dueDate) {
		this.type = type;
		this.amount = amount;
		this.penalty = penalty;
		this.dueDate = LocalDate.parse(dueDate, DateTimeFormatter.ofPattern("MM-dd-yyyy"));
		this.paid = false;
	}

	public Bill(Bill previousBill) {
		this.type = previousBill.type;
		this.amount = previousBill.amount;
		this.penalty = previousBill.penalty;
		this.dueDate = previousBill.dueDate.plusMonths(1);
		this.paid = false;
	}

	@Override
	public boolean pay(double amount, String date) {
		double billAmount = this.calculateAmount(date);

		if (!this.paid && billAmount <= amount) {
			this.paid = true;
			return true;
		} else {
			return false;
		}
	}

	public boolean isPaid() {
		return this.paid;
	}

	public double calculateAmount(String date) {
		if (this.dueDate.isBefore(LocalDate.parse(date, DateTimeFormatter.ofPattern("MM-dd-yyyy")))) {
			return this.amount + this.penalty;
		} else {
			return this.amount;
		}
	}
}
