package com.inheritance.EducationalCourseHierarchy;

public class Main {

	public static void main(String[] args) {
		PaidOnlineCourse course = new PaidOnlineCourse("Mastering Postgres", 200, "masteringpostgres.com", true, 10000,
				10);
		course.displayFeeDetails();
	}

}
