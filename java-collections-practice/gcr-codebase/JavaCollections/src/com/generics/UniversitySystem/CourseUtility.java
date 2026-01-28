package com.generics.UniversitySystem;

import java.util.List;

public class CourseUtility {
	public static void displayAllCourses(List<? extends Course<?>> courses) {
		for (Course<?> course : courses) {
			course.displayCourse();
		}
	}
}
