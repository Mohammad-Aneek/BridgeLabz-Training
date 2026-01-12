package com.dayseven.SkillForge;

public class Instructor extends User {

	public Instructor(String name, int id) {
		super(name, id, Role.Instructor);
	}

	@Override
	protected void addCourse(Course course) {
		if (!courses.contains(course)) {
			courses.add(course);
		}
	}

	@Override
	public void displayCourses() {
		if (courses.isEmpty()) {
			System.out.println("No courses instructed by " + super.name);
		} else {
			System.out.println("Courses instructed by " + super.name + " are:");
			for (Course course : courses) {
				System.out.println(course);
			}
		}

	}

}
