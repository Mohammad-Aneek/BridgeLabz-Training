package com.daythree.CampusConnect;

import java.util.*;

public class Student extends Person implements ICourseActions {
	private List<Double> grades;
	private List<Course> enrolledCourses;

	public Student(String name, String email, String id) {
		super(name, email, id);
		this.grades = new ArrayList<>();
		this.enrolledCourses = new ArrayList<>();
	}

	public void addGrade(double grade) {
		if (grade >= 0 && grade <= 100) {
			grades.add(grade);
		}
	}

	public double calculateGPA() {
		if (grades.isEmpty()) {
			return 0.0;
		}
		double sum = 0;
		for (double g : grades) {
			sum += g;
		}
		return (sum / grades.size()) / 25.0;
	}

	@Override
	public void enrollCourse(Course course) {
		enrolledCourses.add(course);
		course.addStudent(this);
		System.out.println(name + " enrolled in " + course.getCourseName());
	}

	@Override
	public void dropCourse(Course course) {
		enrolledCourses.remove(course);
		course.removeStudent(this);
		System.out.println(name + " dropped " + course.getCourseName());
	}

	@Override
	public void printDetails() {
		System.out.println("Student id: " + id);
		System.out.println("Student name: " + name);
		System.out.printf("Student GPA: %.2f%n", calculateGPA());
	}
}
