package com.dayeight.BudgetWise;

import java.util.ArrayList;

abstract class Budget implements IAnalyzable {
	protected double totalIncome;
	protected double totalExpenses;
	protected ArrayList<Transaction> transactions;

	public Budget(double totalIncome) {
		this.totalIncome = totalIncome;
		this.transactions = new ArrayList<>();
		this.totalExpenses = 0;
	}

	public void addTransaction(Transaction t) {
		transactions.add(t);
		if (t.getType().equalsIgnoreCase("Expense")) {
			totalExpenses += t.getAmount();
		}
	}

	public double getNetSavings() {
		return totalIncome - totalExpenses;
	}
}
