package com.collections.queue;

import java.util.PriorityQueue;

public class HospitalTriage {
	class Patient implements Comparable<Patient> {
		String name;
		int severity;

		Patient(String name, int severity) {
			this.name = name;
			this.severity = severity;
		}

		@Override
		public int compareTo(Patient o) {
			return o.severity - this.severity;
		}
	}

	public static void main(String[] args) {
		PriorityQueue<Patient> triageQueue = new PriorityQueue<>();
		triageQueue.add(new HospitalTriage().new Patient("John", 3));
		triageQueue.add(new HospitalTriage().new Patient("Alice", 5));
		triageQueue.add(new HospitalTriage().new Patient("Bob", 2));

		while (!triageQueue.isEmpty()) {
			Patient patient = triageQueue.poll();
			System.out.println("Name: " + patient.name + ", Severity: " + patient.severity);
		}
	}
}
