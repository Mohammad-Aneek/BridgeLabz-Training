package com.objectmodeling.UniversitySystem;

import java.util.ArrayList;

class University {
	private String name;
	private ArrayList<Department> departments;
	private ArrayList<Faculty> facultyMembers;
	
	public University(String name) {
		this.name = name.trim().toUpperCase();
		this.departments = new ArrayList<Department>();
		this.facultyMembers = new ArrayList<Faculty>();
	}
	
	public void addDepartment(String departmentName) {
		boolean departmentExists = false;
		for (Department department : departments) {
			if (department.is(departmentName)) {
				System.out.println("Department already exists");
				departmentExists = true;
				break;
			}
		}
		
		if (departmentExists) {
			System.out.println("Department already exists!");
		} else {
			departments.add(new Department(departmentName));
		}
	}
	
	public void addFaculty(Faculty faculty) {
		if (!facultyMembers.contains(faculty)) {
			facultyMembers.add(faculty);
		}
	}
	
	public void assignFaculty(String departmentName, Faculty faculty) {
		if (!facultyMembers.contains(faculty)) {
			facultyMembers.add(faculty);
		}
		
		for (Department department : departments) {
			if (department.is(departmentName)) {
				department.assignFaculty(faculty);
			}
		}
	}
	
	public void displayDepartments() {
		System.out.println("****************************************");
		System.out.println("University name: " + name);
		System.out.println("****************************************");
		for (Department department : departments) {
			department.display();
		}
		System.out.println("****************************************");
	}
	
	public void displayFaculty() {
		System.out.println("****************************************");
		System.out.println("University name: " + name);
		System.out.println("****************************************");
		for (Faculty faculty : facultyMembers) {
			faculty.display();
		}
		System.out.println("****************************************");
	}
}
