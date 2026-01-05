package com.dayone.HospitalManagementSystem;

public class Bill implements Payable{
	private double consulattionFee;
	
	private double medicineCost;
	private final double GST = 18;
	
	public Bill(double consultationFee, double medicineCost) {
		this.consulattionFee = consultationFee;
		this.medicineCost = medicineCost;
	}
	
	@Override
	public double calculatePayment() {
		return (this.consulattionFee + this.medicineCost) * (1 + 18/100);
	}
	
	public void displayBill() {
		System.out.println("Bill Details");
		System.out.println("Consultation fee: " + this.consulattionFee);
		System.out.println("Medicine cost: " + this.medicineCost);
		System.out.println("Net total(After GST): " + this.calculatePayment());
	}
}
