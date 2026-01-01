package com.objectmodeling.HospitalSystem;

import java.util.ArrayList;

public class Patient {
	private String name;
    private int age;
    private ArrayList<Doctor> doctorsVisited;

    public Patient(String name, int age) {
        this.name = name;
        this.age = age;
        this.doctorsVisited = new ArrayList<>();
    }

    public void addDoctor(Doctor doctor) {
        if (!doctorsVisited.contains(doctor)) {
            doctorsVisited.add(doctor);
        }
    }

    public void displayDoctors() {
    	System.out.println("--------------------------------");
        System.out.println("Patient " + name + "'s Doctors: ");
        for (Doctor d : doctorsVisited) {
            System.out.println(d);
        }
        System.out.println("--------------------------------");
        
    }
    
    public String toString() {
        return name;
    }
}
