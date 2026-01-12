package com.dayseven.SkillForge;

import java.util.ArrayList;
import java.util.Arrays;

class Course implements ICertifiable {
	private String title;
	private User instructor;
	private double rating;
	private ArrayList<Module> modules;

	public Course(String title, Instructor instructor, double rating, Module... modules) {
		this.title = title;
		this.instructor = instructor;
		this.rating = rating;
		this.modules = new ArrayList<Module>(Arrays.asList(modules));
		instructor.addCourse(this);
	}

	public void addModule(Module module, Module... modules) {
		this.modules.add(module);
		this.modules.addAll(Arrays.asList(modules));
	}

	private void printCertificate(String name) {
		System.out.println("This is to certify that " + name + " has fully completed the course");
	}

	@Override
	public void generateCertificate(Student student) {
		if (student.isEnrolled(this)) {
			int completedModules = 0;

			for (Module module : modules) {
				if (module.isCompleted()) {
					completedModules++;
				}
			}

			if (completedModules == modules.size()) {
				printCertificate(student.toString());
			} else {
				System.out.println("Complete course to get certificate");
			}

		} else {
			System.out.println("Course not enrolled");
		}

	}

	@Override
	public String toString() {
		return String.format("%s [%s]", title, instructor);
	}

}
