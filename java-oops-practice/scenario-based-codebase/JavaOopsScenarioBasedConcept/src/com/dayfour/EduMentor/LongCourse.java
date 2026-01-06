package com.dayfour.EduMentor;

public class LongCourse extends Course {

	public LongCourse(String name, Instructor instructor, Quiz quiz) {
		super(name, instructor, quiz, 10);
	}

	@Override
	public void generateCertificate() {
		System.out.println("Longcourse certificate");
	}

	@Override
	void displayDetails() {
		System.out.println("Long course details: ");
		System.out.println("Course Name: " + name);
		System.out.println("Instructor: " + instructor);
		System.out.println("Duration (in months): " + duration);

	}
}
