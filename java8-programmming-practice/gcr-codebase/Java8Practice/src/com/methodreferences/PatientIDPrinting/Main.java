package com.methodreferences.PatientIDPrinting;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<Patient> patients = new ArrayList<Patient>();
		patients.add(new Patient("P001", "John Doe"));
		patients.add(new Patient("P002", "Jane Smith"));
		patients.add(new Patient("P003", "Alice Johnson"));
		patients.add(new Patient("P004", "Bob Brown"));

		patients.forEach(System.out::println);
	}
}
