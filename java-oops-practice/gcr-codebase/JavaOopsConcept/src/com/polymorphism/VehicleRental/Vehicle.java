package com.polymorphism.VehicleRental;

abstract class Vehicle implements Insurable {
	private String vehicleNumber;
    private String type;
    private String policyNumber;
    protected double rentalRate;
    
    
    public Vehicle(String vehicleNumber, String type, double rentalRate, String policyNumber) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
        this.policyNumber = policyNumber;
    }

    public abstract double calculateRentalCost(int days);

    @Override
    public String getInsuranceDetails() {
        return "Policy Number: #" + policyNumber;
    }
    
    public void displayInfo() {
        System.out.println(type + " [" + vehicleNumber + "]");
    }
    
    public void displayDetails(int days) {
    	System.out.println("Vehicle tyep: " + type);
    	System.out.println("Vehicle number: " + vehicleNumber);
    	System.out.println(getInsuranceDetails());
    	System.out.println("Rental Cost: " + calculateRentalCost(days));
    	System.out.println("Insurance: " + calculateInsurance());
    }

}
