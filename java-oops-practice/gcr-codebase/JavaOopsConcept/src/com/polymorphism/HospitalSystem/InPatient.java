package com.polymorphism.HospitalSystem;

public class InPatient extends Patient {

	private double dailyRoomCharge;
	private int daysAdmitted;
	private double treatmentCost;

	public InPatient(String id, String name, int age, double roomCharge, int days, double treatment) {
		super(id, name, age);
		this.dailyRoomCharge = roomCharge;
		this.daysAdmitted = days;
		this.treatmentCost = treatment;
	}

	@Override
	public double calculateBill() {
		return (dailyRoomCharge * daysAdmitted) + treatmentCost;
	}
}
