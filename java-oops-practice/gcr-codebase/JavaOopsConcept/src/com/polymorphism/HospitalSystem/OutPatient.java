package com.polymorphism.HospitalSystem;

public class OutPatient extends Patient {

	private double consultationFee;
	private double medicineCost;

	public OutPatient(String id, String name, int age, double fee, double meds) {
		super(id, name, age);
		this.consultationFee = fee;
		this.medicineCost = meds;
	}

	@Override
	public double calculateBill() {
		return consultationFee + medicineCost;
	}
}
