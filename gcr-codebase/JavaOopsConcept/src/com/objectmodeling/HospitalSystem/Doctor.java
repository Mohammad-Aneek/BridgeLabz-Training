package com.objectmodeling.HospitalSystem;

import java.util.ArrayList;

public class Doctor {
	private String name;
    private String specialization;
    private ArrayList<Patient> patientsTreated;

    public Doctor(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
        this.patientsTreated = new ArrayList<>();
    }

    public void consult(Patient patient) {
        this.addPatient(patient);
        patient.addDoctor(this);
    }

    public void addPatient(Patient patient) {
        if (!patientsTreated.contains(patient)) {
            patientsTreated.add(patient);
        }
    }

    public void display() {
    	System.out.println("--------------------------------");
        System.out.println("Doctor Name: " + name );
        System.out.println("Specialization: " + specialization);
        System.out.println("Patient's name: ");
        for (Patient p : patientsTreated) {
            System.out.println(p);
        }
        System.out.println("--------------------------------");
    }
    
    public String toString() {
        return name;
    }
}
