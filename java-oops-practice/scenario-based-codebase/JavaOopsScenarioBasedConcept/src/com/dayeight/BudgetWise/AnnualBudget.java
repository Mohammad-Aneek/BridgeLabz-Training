package com.dayeight.BudgetWise;

public class AnnualBudget extends Budget {
	private int year;
	private double projectedExpenses;

	public AnnualBudget(double totalIncome, int year) {
		super(totalIncome);
		this.year = year;
		this.projectedExpenses = 0;
	}

	public void updateProjectedExpenses(double amount) {
		this.projectedExpenses = amount;
	}

	@Override
	public void generateReport() {
		System.out.println("=== ANNUAL REPORT (" + year + ") ===");
		System.out.println("Total Income: $" + totalIncome);
		System.out.println("Total Actual Expenses: $" + totalExpenses);
		System.out.println("Projected End-of-Year Savings: $" + (totalIncome - projectedExpenses));
		System.out.println("Current Net Savings: $" + getNetSavings());
	}

	@Override
	public void detectOverspend() {
		double averageMonthlySpend = totalExpenses / 12.0;
		if (averageMonthlySpend > (totalIncome / 12.0)) {
			System.out.println("WARNING: At this rate, you will end the year in debt.");
		} else {
			System.out.println("Status: Annual spending is on track.");
		}
	}

}
