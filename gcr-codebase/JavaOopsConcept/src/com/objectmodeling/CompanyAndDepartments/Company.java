package com.objectmodeling.CompanyAndDepartments;

import java.util.ArrayList;

public class Company {
	private String name;
	private ArrayList<Department> departments;

	public Company(String name) {
		this.name = name;
		this.departments = new ArrayList<Department>();
	}

	public void addDepartment(String departmentName) {
		// to check if department with the same name already exists or not
		boolean departmentExists = false;
		for (Department department : departments) {
			if (department.is(departmentName)) {
				departmentExists = true;
				break;
			}
		}

		if (departmentExists) {
			// if department already exits
			System.out.println("Cannot create department " + departmentName + "! It already exists");
		} else {
			// if department does not exist
			System.out.println("Department added successfully");
			departments.add(new Department(departmentName));
		}
	}
	
	public void addEmployee(String departmentName, String employeeName, String employeePosition) {
		for (Department department : departments) {
			if (department.is(departmentName)) {
				department.addEmployee(employeeName, employeePosition);
				System.out.println("Employee addedd successfully");
				return;
			}
		}
		
		System.out.println("Cannot add Employee! Department doesnot exist.");
	}
	
	public void display() {
		System.out.println("****************************************");
		System.out.println("Company name: " + this.name);
		for (Department department : departments) {
			department.display();
		}
		System.out.println("****************************************");
	}
}
