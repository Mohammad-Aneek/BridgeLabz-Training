package com.daytwo.CabbyGo;

public class Driver {
	private String name;
	private String licenseNumber;
	private double rating;

	public Driver(String name, String licenseNumber, double rating) {
		this.name = name;
		this.licenseNumber = licenseNumber;
		this.rating = rating;
	}

	public String getName() {
		return name;
	}
	
	public void display() {
		System.out.println("---------------------------------------");
		System.out.println("Driver Details");
		System.out.println("---------------------------------------");
		System.out.println("Name: " + name);
		System.out.println("License Number: " + licenseNumber);
		System.out.println("Rating: " + rating);
		System.out.println("---------------------------------------");
	}
}
