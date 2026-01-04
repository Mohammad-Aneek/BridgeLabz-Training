package com.polymorphism.HospitalSystem;

import java.util.ArrayList;

public abstract class Patient implements MedicalRecord {
	private String patientId;
	private String name;
	private ArrayList<String> diagnosisHistory;
	private int age;

	public Patient(String patientId, String name, int age) {
		this.patientId = patientId;
		this.name = name;
		this.age = age;
		this.diagnosisHistory = new ArrayList<String>();
	}

	public abstract double calculateBill();

	@Override
	public void addRecord(String diagnosis) {
		diagnosisHistory.add(diagnosis);
		System.out.println("Record updated for " + name);
	}

	@Override
	public void viewRecords() {
		if (diagnosisHistory.isEmpty()) {
			System.out.println("No Records");
		} else {
			System.out.println("Diagnosis history: ");
			for (String record : diagnosisHistory) {
				System.out.println("- " + record);
			}
		}
	}

	public void displayDetails() {
		System.out.println("Patient ID: " + patientId);
		System.out.println("Patient name: " + name);
		System.out.println("Patient age: " + age);
		viewRecords();
		System.out.println("Total Bill Amount: " + calculateBill());
	}
}
