package com.polymorphism.VehicleRental;

public class Bike extends Vehicle{
	public Bike(String number, double rate, String policy) {
        super(number, "Bike", rate, policy);
    }

    @Override
    public double calculateRentalCost(int days) {
        return rentalRate * days;
    }

    @Override
    public double calculateInsurance() {
        return 200.0; 
    }
}
