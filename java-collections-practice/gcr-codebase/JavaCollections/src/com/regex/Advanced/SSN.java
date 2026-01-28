package com.regex.Advanced;

public class SSN {
	public static boolean isValidSSN(String ssn) {
		return ssn.matches("^\\d{3}-\\d{2}-\\d{4}$");
	}

	public static void main(String[] args) {
		String sampleSSN = "123-45-6789";
		if (isValidSSN(sampleSSN)) {
			System.out.println(sampleSSN + " is a valid SSN.");
		} else {
			System.out.println(sampleSSN + " is not a valid SSN.");
		}
	}
}
