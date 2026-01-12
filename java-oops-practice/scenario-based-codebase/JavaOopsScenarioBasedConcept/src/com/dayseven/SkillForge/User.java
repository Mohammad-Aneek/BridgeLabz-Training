package com.dayseven.SkillForge;

import java.util.ArrayList;

public abstract class User {
	protected String name;
	protected int id;
	protected Role role;
	protected ArrayList<Course> courses;

	public User(String name, int id, Role role) {
		this.name = name;
		this.id = id;
		this.role = role;
		this.courses = new ArrayList<Course>();
	}

	@Override
	public String toString() {
		return name;
	}

	protected abstract void addCourse(Course course);

	public abstract void displayCourses();
}
