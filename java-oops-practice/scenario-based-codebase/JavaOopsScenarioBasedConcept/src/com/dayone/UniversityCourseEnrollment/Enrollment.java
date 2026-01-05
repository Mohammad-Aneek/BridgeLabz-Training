package com.dayone.UniversityCourseEnrollment;

public class Enrollment implements Graded{
	private Student student;
	 private Course course;
	 private int marks;
	 
	 public Enrollment(Student student, Course course, int marks) {
	     this.student = student;
	     this.course = course;
	     this.marks = marks;
	 }

	 @Override
	 public void assignGrade() {
	     if (marks >= 90)
	    	 student.updateGpa(4.0);
	     else if (marks >= 75)
	    	 student.updateGpa(3.0);
	     else if (marks >= 60)
	    	 student.updateGpa(2.0);
	     else
	    	 student.updateGpa(1.0);
	 }
	 
	 public void display() {
		 student.displayInfo();
		 course.displayCourse();
	 }
}
