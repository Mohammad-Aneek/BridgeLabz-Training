package com.dayfour.EduMentor;

public class Instructor extends User {
	Instructor(int id, String name, String email) {
		super(id, name, email);
	}

	@Override
	public void display() {
		System.out.println("Learner details");
		System.out.println("ID: " + id);
		System.out.println("Name: " + name);
		System.out.println("Email: " + email);
	}

	@Override
	public String toString() {
		return name + "[" + id + "]";
	}
}
