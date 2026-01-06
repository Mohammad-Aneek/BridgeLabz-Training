package com.dayfour.EduMentor;

public class ShortCourse extends Course {

	public ShortCourse(String name, Instructor instructor, Quiz quiz) {
		super(name, instructor, quiz, 4);
	}

	@Override
	public void generateCertificate() {
		System.out.println("Shortcourse certificate");
	}

	@Override
	void displayDetails() {
		System.out.println("Short course details: ");
		System.out.println("Course Name: " + name);
		System.out.println("Instructor: " + instructor);
		System.out.println("Duration (in weeks): " + duration);

	}

}
