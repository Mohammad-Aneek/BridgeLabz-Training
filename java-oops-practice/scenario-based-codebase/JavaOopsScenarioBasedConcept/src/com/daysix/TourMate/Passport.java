package com.daysix.TourMate;

public class Passport {
	private String name;
	private boolean valid;
	
	public Passport(String name, boolean valid) {
		this.name = name;
		this.valid = valid;
	}
	
	boolean isValid() {
		return valid;
	}
	
}
