package com.objectmodeling.UniversitySystem;

import java.util.ArrayList;

class Department {
	private String name;
	private ArrayList<Faculty> assignedFaculty;
	
	Department(String name) {
		this.name = name.trim().toUpperCase();
		this.assignedFaculty = new ArrayList<Faculty>();
	}
	
	public void assignFaculty(Faculty faculty) {
		if (!assignedFaculty.contains(faculty)) {
			assignedFaculty.add(faculty);
			faculty.assignDepartment(this);
		}
	}
	
	public boolean is(String name) {
		return this.name.equals(name.trim().toUpperCase());
	}
	
	public String toString() {
		return String.format("%s (%d faculties)", name,assignedFaculty.size());
	}
	
	public void display() {
		System.out.println("****************************************");
		System.out.println("Department name: " + this.name);
		System.out.println("****************************************");
		for (Faculty faculty : assignedFaculty) {
			System.out.println("- " + faculty);
			System.out.println("****************************************");
		}
	}
}
