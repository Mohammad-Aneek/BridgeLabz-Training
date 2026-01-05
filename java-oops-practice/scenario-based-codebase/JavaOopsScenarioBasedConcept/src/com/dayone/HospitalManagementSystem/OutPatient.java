package com.dayone.HospitalManagementSystem;

public class OutPatient extends Patient {
	private String visitDate;

    public OutPatient(String id, String name, int age, String visitDate) {
        super(id, name, age);
        this.visitDate = visitDate;
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Visit Date: " + visitDate);
    }
}
