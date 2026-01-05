package com.dayone.HospitalManagementSystem;

public class Patient {
	protected String id;
	protected String name;
	private int age;
	protected boolean isEmergency;

	public Patient(String id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public Patient(String id, String name, int age, boolean isEmergency) {
		this(id, name, age);
		this.isEmergency = isEmergency;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void displayInfo() {
		System.out.println("Patient ID: " + id);
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		if (isEmergency) {
			System.out.println("Status: Emergency");
		}
	}
}
