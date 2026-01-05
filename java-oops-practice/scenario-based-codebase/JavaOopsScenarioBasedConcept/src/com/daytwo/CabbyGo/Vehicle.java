package com.daytwo.CabbyGo;

public abstract class Vehicle {
	private String vehicleNumber;
	private int capacity;
	private String type;
	private double baseFare;
	private double ratePerKm;

	public Vehicle(String vehicleNumber, int capacity, String type, double baseFare, double ratePerKm) {
		this.vehicleNumber = vehicleNumber;
		this.capacity = capacity;
		this.type = type;
		this.baseFare = baseFare;
		this.ratePerKm = ratePerKm;
	}

	public double calculateFare(double distance) {
		return baseFare + (distance * ratePerKm);
	}

	public String getType() {
		return type;
	}
	
	public void display() {
		System.out.println("---------------------------------------");
		System.out.println("Vehicle details");
		System.out.println("---------------------------------------");
		System.out.println("Vehicle type: " + type);
		System.out.println("Vehicle number: " + vehicleNumber);
		System.out.println("Vehicle capacity: " + capacity);
		System.out.println("Base fare:" + baseFare);
		System.out.println("Rate per km: " + ratePerKm);
		System.out.println("---------------------------------------");
	}
}
