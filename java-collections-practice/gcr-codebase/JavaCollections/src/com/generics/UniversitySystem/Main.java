package com.generics.UniversitySystem;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<Course<?>> masterCourseList = new ArrayList<>();

		Course<ExamCourse> math = new Course<>("Calculus 101", new ExamCourse());
		Course<AssignmentCourse> art = new Course<>("Modern Art", new AssignmentCourse());

		masterCourseList.add(math);
		masterCourseList.add(art);

		CourseUtility.displayAllCourses(masterCourseList);
	}
}
