package com.dayfour.HospitalQueue;

public class Main {
	public static void main(String[] args) {
		Patient[] queue = { new Patient(1, "A", 3), new Patient(2, "B", 9), new Patient(3, "C", 5),
				new Patient(4, "D", 2), new Patient(5, "E", 8) };

		System.out.println("Before sort: ");
		for (Patient patient : queue) {
			System.out.println(patient);
		}

		HospitalQueue.bubbleSort(queue);

		System.out.println("After sort: ");
		for (Patient patient : queue) {
			System.out.println(patient);
		}
	}
}
