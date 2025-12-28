package com.constructor.leveltwo;

public class PostgraduateStudent extends Student{
	
	public PostgraduateStudent(int rollNumber, String name, double CGPA) {
		super(rollNumber,name,CGPA);
	}
	
	public void showDetails() {
		System.out.println("Roll Number: " + this.rollNumber);
		System.out.println("Name: " + this.name);
		System.out.println("CGPA: " + this.getCGPA());
	}
}
