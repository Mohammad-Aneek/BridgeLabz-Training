package com.objectmodeling.SchoolSystem;

import java.util.ArrayList;

class Course {
	private String title;
	private ArrayList<Student> enrolledStudents;
	
	public Course(String title) {
		this.title = title;
		enrolledStudents = new ArrayList<Student>();
	}
	
	public void addStudent(Student student) {
		if (!enrolledStudents.contains(student)) {
			enrolledStudents.add(student);
			student.enroll(this);
		}
	}
	
	public String toString() {
		return String.format("%s (%d students)", title, enrolledStudents.size());
	}
	
	public void display() {
		System.out.println("----------------------------------------");
		System.out.println("Course title: " + this.title);
		System.out.println("----------------------------------------");

		for (Student student : enrolledStudents) {
			System.out.println(student);
		}
		System.out.println("----------------------------------------");
	} 
}
