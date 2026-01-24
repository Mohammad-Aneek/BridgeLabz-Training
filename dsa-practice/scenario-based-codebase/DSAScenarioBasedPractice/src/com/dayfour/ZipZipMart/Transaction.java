package com.dayfour.ZipZipMart;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Transaction implements Comparable<Transaction> {
	private int id;
	private LocalDate date;
	private double amount;

	private static int counter = 0;

	public Transaction(String date, double amount) {
		this.id = ++counter;
		this.date = LocalDate.parse(date, DateTimeFormatter.ofPattern("MM-dd-yyyy"));
		this.amount = amount;
	}

	@Override
	public String toString() {
		return String.format("id: %d, price: %.2f, date: %s", id, amount,
				date.format(DateTimeFormatter.ofPattern("dd MMM yyyy")));
	}

	@Override
	public int compareTo(Transaction transaction) {
		if (!this.date.equals(transaction.date)) {
			return this.date.compareTo(transaction.date);
		} else if (this.amount < transaction.amount) {
			return -1;
		} else if (this.amount > transaction.amount) {
			return 1;
		} else {
			return 0;
		}
	}

}
