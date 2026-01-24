package com.dayeight.BudgetWise;

public class MonthlyBudget extends Budget {
	private String month;
	private double spendingLimit;

	public MonthlyBudget(double income, String month, double limit) {
		super(income);
		this.month = month;
		this.spendingLimit = limit;
	}

	@Override
	public void generateReport() {
		System.out.println("--- Report for " + month + " ---");
		System.out.println("Income: $" + totalIncome);
		System.out.println("Expenses: $" + totalExpenses);
		System.out.println("Savings: $" + getNetSavings());
	}

	@Override
	public void detectOverspend() {
		if (totalExpenses > spendingLimit) {
			System.out.println("ALERT: You have exceeded your monthly limit of $" + spendingLimit);
		} else {
			System.out.println("Status: Within Budget.");
		}
	}
}
