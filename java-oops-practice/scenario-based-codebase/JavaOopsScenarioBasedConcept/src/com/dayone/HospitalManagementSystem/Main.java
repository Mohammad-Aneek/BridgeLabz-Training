package com.dayone.HospitalManagementSystem;

public class Main {
	public static void main(String[] args) {
		Doctor doctor = new Doctor("101", "Dr. Sharma", "Cardiology");
        doctor.displayInfo();

        Patient p1 = new InPatient("1", "x", 23, 5);
        Patient p2 = new OutPatient("2", "Rahul", 30, "01-Jan-2026");

        p1.displayInfo();
        p2.displayInfo();

        Payable bill = new Bill(500, 1200);
        System.out.println("Total Bill Amount: ₹" + bill.calculatePayment());
    }
}
