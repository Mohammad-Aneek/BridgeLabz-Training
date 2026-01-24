package com.dayeight.BudgetWise;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Transaction {
	private String type;
	private double amount;
	private String category;
	private LocalDateTime timestamp;

	public Transaction(String type, double amount, String category, String timestamp) {
		this.type = type;
		this.amount = amount;
		this.category = category;
		this.timestamp = LocalDateTime.parse(timestamp, DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss"));
	}

	public String getType() {
		return type;
	}

	public double getAmount() {
		return amount;
	}

	public String getCategory() {
		return category;
	}
}