package com.polymorphism.RideHailingApplication;

public class Auto extends Vehicle{
	public Auto(String id, String driver) {
        super(id, driver, 15.0); 
    }

    @Override
    public double calculateFare(double distance) {
        return 20 + (ratePerKm * distance);
    }
    
    @Override
	public void displayDetails(double distance) {
		System.out.println("Vehicle: Auto");
		super.displayDetails(distance);
	}
}
