package com.daynine.MedWarehouse;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Medicine implements Comparable<Medicine> {
	private String name;
	private LocalDate expiryDate;

	public Medicine(String name, String expiryDate) {
		this.name = name;
		this.expiryDate = LocalDate.parse(expiryDate, DateTimeFormatter.ofPattern("MM-dd-yyyy"));
	}

	@Override
	public int compareTo(Medicine other) {
		return this.expiryDate.compareTo(other.expiryDate);
	}

	@Override
	public String toString() {
		return name + "[" + expiryDate.format(DateTimeFormatter.ofPattern("dd MMM yyyy")) + "]";
	}
}
