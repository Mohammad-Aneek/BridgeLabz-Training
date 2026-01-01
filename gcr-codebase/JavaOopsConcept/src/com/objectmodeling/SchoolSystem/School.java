package com.objectmodeling.SchoolSystem;

import java.util.ArrayList;

class School {
	private String name;
	private ArrayList<Student> students;

	School(String name) {
		this.name = name;
		students = new ArrayList<Student>();
	}

	public void addStudent(Student student) {
		if (!students.contains(student)) {
			students.add(student);
		}
	}

	public void display() {
		System.out.println("----------------------------------------");
		System.out.println("School name: " + this.name);
		System.out.println("----------------------------------------");

		for (Student student : students) {
			System.out.println(student);
		}
		System.out.println("----------------------------------------");
	}
}
