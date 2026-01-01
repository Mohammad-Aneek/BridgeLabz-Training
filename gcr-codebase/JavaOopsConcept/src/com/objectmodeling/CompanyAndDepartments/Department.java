package com.objectmodeling.CompanyAndDepartments;

import java.util.ArrayList;

public class Department {
	private String name;
	private ArrayList<Employee> employees;

	public Department(String name) {
		this.name = name.trim().toUpperCase();
		employees = new ArrayList<Employee>();
	}

	public void addEmployee(String employeeName, String employeePosition) {
		employees.add(new Employee(employeeName, employeePosition));
	}

	public boolean is(String name) {
		return this.name.equals(name.trim().toUpperCase());
	}

	public void display() {
		System.out.println("========================================");
		System.out.println("Department name: " + this.name);
		for (Employee employee : employees) {
			employee.display();
		}
		System.out.println("========================================");
	}
}
