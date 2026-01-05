package com.dayone.HospitalManagementSystem;

public class InPatient extends Patient {
    private int daysAdmitted;

    public InPatient(String id, String name, int age, int daysAdmitted) {
        super(id, name, age, true);
        this.daysAdmitted = daysAdmitted;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Days Admitted: " + daysAdmitted);
    }
}
