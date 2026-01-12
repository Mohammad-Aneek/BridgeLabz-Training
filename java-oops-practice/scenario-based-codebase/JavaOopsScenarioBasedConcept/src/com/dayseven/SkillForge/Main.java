package com.dayseven.SkillForge;

public class Main {
	public static void main(String[] args) {
		Instructor instructor = new Instructor("Vishal sir", 101);

		Module m1 = new Module("Variables & Datatypes", 30, false);
		Module m2 = new Module("Control Flow", 45, false);
		Module m3 = new Module("Functions & Methods", 60, false);

		Course javaCourse = new Course("Java Bootcamp", instructor, 4.9, m1, m2, m3);

		Student student = new Student("Aneek", 1);

		student.addCourse(javaCourse);
		student.displayCourses();
		javaCourse.generateCertificate(student);
		m1.markComplete();
		m2.markComplete();
		m3.markComplete();

		javaCourse.generateCertificate(student);
	}
}
