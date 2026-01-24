package com.dayfour.HospitalQueue;

public class Patient implements Comparable<Patient> {
	protected int id;
	protected String name;
	protected int criticalityLevel;

	public Patient(int id, String name, int criticalityLevel) {
		this.id = id;
		this.name = name;
		if (1 <= criticalityLevel && criticalityLevel <= 10) {
			this.criticalityLevel = criticalityLevel;
		} else {
			criticalityLevel = 10;
		}
	}

	@Override
	public String toString() {
		return String.format("%s [id: %d] [critical: %d]", name, id, criticalityLevel);
	}

	@Override
	public int compareTo(Patient o) {
		return this.criticalityLevel - o.criticalityLevel;
	}
}
