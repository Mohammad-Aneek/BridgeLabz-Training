package com.stream.DoctorAvailablity;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Doctor> doctors = Arrays.asList(
				new Doctor("Dr. Smith", "Cardiology",
						Arrays.asList("Monday", "Friday")),
				new Doctor("Dr. Adams", "Neurology",
						Arrays.asList("Saturday", "Sunday")),
				new Doctor("Dr. Doe", "Pediatrics",
						Arrays.asList("Monday", "Sunday")),
				new Doctor("Dr. Brown", "Dermatology",
						Arrays.asList("Wednesday")));

		doctors.stream()
				.filter(d -> d.availableDays.contains("Sunday")
						|| d.availableDays.contains("Saturday"))
				.sorted(Comparator.comparing(d -> d.specialty));
	}
}
