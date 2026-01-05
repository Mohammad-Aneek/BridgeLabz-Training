package com.daythree.CampusConnect;

class Faculty extends Person {
	private String department;

	public Faculty(String name, String email, String id, String department) {
		super(name, email, id);
		this.department = department;
	}

	@Override
	public void printDetails() {
		System.out.println("Faculty ID: " + id);
		System.out.println("Faculty Name: " + name);
		System.out.println("Department: " + department);
	}

}