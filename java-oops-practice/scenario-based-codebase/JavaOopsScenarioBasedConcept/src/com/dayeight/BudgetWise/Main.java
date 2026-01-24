package com.dayeight.BudgetWise;

public class Main {
	public static void main(String[] args) {
		MonthlyBudget janBudget = new MonthlyBudget(5000, "January", 2000);

		janBudget.addTransaction(new Transaction("Expense", 120.00, "Groceries", "01-05-2024 10:30:00"));
		janBudget.addTransaction(new Transaction("Expense", 2000.00, "Rent", "01-01-2024 09:00:00"));
		janBudget.addTransaction(new Transaction("Income", 5000.00, "Salary", "01-01-2024 08:00:00"));

		janBudget.detectOverspend();
		janBudget.generateReport();

		System.out.println();

		AnnualBudget yearBudget = new AnnualBudget(60000, 2024);
		yearBudget.addTransaction(new Transaction("Expense", 5500.00, "Vacation", "06-15-2024 12:00:00"));

		yearBudget.detectOverspend();
		yearBudget.generateReport();
	}
}
