package com.objectmodeling.UniversitySystem;

import java.util.ArrayList;

public class Faculty {
	private String name;
	private ArrayList<Department> assignedDepartments;
	
	Faculty(String name) {
		this.name = name;
		this.assignedDepartments = new ArrayList<Department>();
	}
	
	public void assignDepartment(Department department) {
		if (!assignedDepartments.contains(department)) {
			assignedDepartments.add(department);
			department.assignFaculty(this);
		}
	}
	
	public String toString() {
		return name;
	}
	
	public void display() {
		System.out.println("****************************************");
		System.out.println("Faculty name: " + this.name);
		System.out.println("****************************************");
		for (Department department : assignedDepartments) {
			System.out.println("- " + department);
			System.out.println("****************************************");
		}
	}
}
