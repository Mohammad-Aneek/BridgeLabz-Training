package com.daythree.CampusConnect;

import java.util.*;

public class Course {
	private String courseName;
	private Faculty instructor;
	private List<Student> studentList;

	public Course(String courseName, Faculty instructor) {
		this.courseName = courseName;
		this.instructor = instructor;
		this.studentList = new ArrayList<>();
	}

	public void addStudent(Student s) {
		studentList.add(s);
	}

	public void removeStudent(Student s) {
		studentList.remove(s);
	}

	public String getCourseName() {
		return courseName;
	}

	public void showClassRoster() {
		System.out.println("Course name: " + courseName);
		System.out.println("Instructor name: " + instructor.name);
		System.out.println("Enrolled Students:");
		for (Student s : studentList) {
			System.out.println("- " + s.name);
		}
	}
}
