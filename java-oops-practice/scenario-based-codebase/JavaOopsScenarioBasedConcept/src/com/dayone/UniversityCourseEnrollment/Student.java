package com.dayone.UniversityCourseEnrollment;

abstract class Student {
	protected String id;
	protected String name;
	private double gpa;

	public Student(String id, String name) {
		this.id = id;
		this.name = name;
		this.gpa = 0.0;
	}

	public Student(String id, String name, double initialGpa) {
		this.id = id;
		this.name = name;
		this.gpa = initialGpa;
	}

	public String getTranscript() {
		return "Student ID: " + this.id + ", Name: " + name + ", GPA: " + gpa;
	}

	public void updateGpa(double newGpa) {
		this.gpa = newGpa;
	}
	
	abstract void displayInfo();
}
