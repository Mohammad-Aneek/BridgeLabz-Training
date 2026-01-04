package com.polymorphism.EmployeeManagementSystem;

public class PartTimeEmployee extends Employee {
	private int hoursWorked;

	public PartTimeEmployee(String employeeID, String name, double baseSalary, int hoursWorked) {
		super(employeeID, name, baseSalary);
		this.hoursWorked = hoursWorked;
	}

	@Override
	double calculateSalary() {
		double baseSalary = getBaseSalary();
		return baseSalary * hoursWorked;
	}

}
