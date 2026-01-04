package com.polymorphism.RideHailingApplication;

abstract class Vehicle implements GPS {
	private String vehicleId;
    private String driverName;
    protected double ratePerKm;
    private String currentLocation;

    public Vehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
        this.currentLocation = "Hub";
    }

    public abstract double calculateFare(double distance);

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String newLocation) {
        this.currentLocation = newLocation;
    }

    public void displayDetails(double distance) {
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Driver name: " + driverName);
        System.out.println("Location: " + currentLocation);
        System.out.println("Rate per KM: " + ratePerKm);
		System.out.println("Estimated Fare: $" + calculateFare(distance));
    }
}
