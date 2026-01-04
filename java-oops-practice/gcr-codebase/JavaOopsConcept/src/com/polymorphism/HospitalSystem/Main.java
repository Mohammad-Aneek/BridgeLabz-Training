package com.polymorphism.HospitalSystem;

public class Main {
	public static void main(String[] args) {
		Patient p1 = new InPatient("1", "x", 45, 500, 5, 2000);
		Patient p2 = new OutPatient("2", "y", 30, 300, 150);

		p1.addRecord("Severe Viral Fever - Admitted");
		p2.addRecord("Migraine - Prescribed painkillers");

		System.out.println("----------------------------");
		p1.displayDetails();
		System.out.println("----------------------------");
		p2.displayDetails();
	}
}
