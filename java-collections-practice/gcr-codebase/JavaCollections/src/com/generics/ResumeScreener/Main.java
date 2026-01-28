package com.generics.ResumeScreener;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		SoftwareEngineer se = new SoftwareEngineer();
		DataScientist ds = new DataScientist();
		ProductManager pm = new ProductManager();

		Resume<SoftwareEngineer> resume1 = new Resume<>("Aneek", se, 5);
		Resume<DataScientist> resume2 = new Resume<>("Someone", ds, 1);
		Resume<ProductManager> resume3 = new Resume<>("Someone Else", pm, 8);

		List<Resume<? extends JobRole>> pileOfResumes = new ArrayList<>();
		pileOfResumes.add(resume1);
		pileOfResumes.add(resume2);
		pileOfResumes.add(resume3);

		Screener.screenResumes(pileOfResumes);
	}
}
