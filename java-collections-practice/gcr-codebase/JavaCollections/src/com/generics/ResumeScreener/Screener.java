package com.generics.ResumeScreener;

import java.util.List;

public class Screener {
	public static void screenResumes(List<? extends Resume<? extends JobRole>> resumes) {
		for (Resume<? extends JobRole> resume : resumes) {
			if (resume.getExperienceYears() > 2) {
				System.out.println("Accepted");
			} else {
				System.out.println("Rejected");
			}
			resume.displayResume();
			System.out.println("-------------------------");
		}
	}
}
