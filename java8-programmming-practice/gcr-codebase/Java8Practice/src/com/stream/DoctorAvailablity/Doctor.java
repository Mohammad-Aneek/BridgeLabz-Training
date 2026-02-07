package com.stream.DoctorAvailablity;

import java.util.List;

class Doctor {
	String name;
	String specialty;
	List<String> availableDays;

	public Doctor(String name, String specialty, List<String> availableDays) {
		this.name = name;
		this.specialty = specialty;
		this.availableDays = availableDays;
	}

	public String toString() {
		return name + " [" + specialty + "]";
	}
}