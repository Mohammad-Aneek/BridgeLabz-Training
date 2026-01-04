package com.polymorphism.EmployeeManagementSystem;

abstract class Employee implements Department {
	private String employeeID;
	private String name;
	private String department;
	private double baseSalary;

	public Employee(String employeeID, String name, double baseSalary) {
		this.employeeID = employeeID;
		this.name = name;
		this.baseSalary = baseSalary;
		this.department = null;
	}

	public void displayDetails() {
		System.out.println("Name: " + name);
		System.out.println("Employee ID: " + employeeID);
		System.out.println("Department: " + department);
		System.out.println("Base salary: " + calculateSalary());
	}

	abstract double calculateSalary();

	
	
	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	@Override
	public void assignDepartment(String department) {
		this.department = department;
	}

	@Override
	public String getDepartmentDetails() {
		return this.department;
	}
}
