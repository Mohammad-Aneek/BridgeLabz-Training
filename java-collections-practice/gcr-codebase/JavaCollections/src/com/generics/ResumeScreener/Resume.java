package com.generics.ResumeScreener;

public class Resume<T extends JobRole> {
	private T role;
	private String name;
	private int experienceYears;

	public Resume(String name, T role, int experienceYears) {
		this.name = name;
		this.role = role;
		this.experienceYears = experienceYears;
	}

	public T getRole() {
		return role;
	}

	public int getExperienceYears() {
		return experienceYears;
	}

	public void displayResume() {
		System.out.println("Name: " + name);
		System.out.println("Experience: " + experienceYears + " years");
		role.displaySkills();
		System.out.println("-------------------------");
	}
}