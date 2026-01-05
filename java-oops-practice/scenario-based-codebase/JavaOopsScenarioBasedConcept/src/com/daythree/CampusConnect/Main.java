package com.daythree.CampusConnect;

public class Main {

	public static void main(String[] args) {
		Faculty faculty = new Faculty("x", "x@gmail.com", "1", "Computer Science");
		Student student = new Student("y", "y@gamil.com", "1");
		Course course = new Course("Intro to Java", faculty);

		student.addGrade(95.0);
		student.addGrade(88.0);
		student.enrollCourse(course);

		faculty.printDetails();
		student.printDetails();

		course.showClassRoster();
	}

}
