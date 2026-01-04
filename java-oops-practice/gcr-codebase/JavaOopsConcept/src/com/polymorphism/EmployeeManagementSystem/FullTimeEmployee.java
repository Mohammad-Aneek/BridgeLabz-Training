package com.polymorphism.EmployeeManagementSystem;

public class FullTimeEmployee extends Employee {
	private double bonus;

	public FullTimeEmployee(String employeeID, String name, double baseSalary, double bonus) {
		super(employeeID, name, baseSalary);
		this.bonus = bonus;
	}

	@Override
	double calculateSalary() {
		double baseSalary = getBaseSalary();
		return baseSalary * (100 + bonus) / 100;
	}

}
