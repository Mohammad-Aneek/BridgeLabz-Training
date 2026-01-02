package com.objectmodeling.HospitalSystem;

public class Main {

	public static void main(String[] args) {
        Hospital hospital = new Hospital("All India Institute of Medical Sciences");

        Doctor docStrange = new Doctor("Dr. Strange", "Neurosurgeon");
        Doctor docHouse = new Doctor("Dr. House", "Diagnostician");
        
        hospital.addDoctor(docStrange);
        hospital.addDoctor(docHouse);

        Patient p1 = new Patient("Iron Man", 45);
        Patient p2 = new Patient("Spider-Man", 18);
        Patient p3 = new Patient("Thor", 1500);

        hospital.addPatient(p1);
        hospital.addPatient(p2);
        hospital.addPatient(p3);

        docStrange.consult(p1);
        docHouse.consult(p1);
        docStrange.consult(p2);

        docStrange.display();
        docHouse.display();
        
        p1.displayDoctors();
        p2.displayDoctors();
        p3.displayDoctors();
	}

}
