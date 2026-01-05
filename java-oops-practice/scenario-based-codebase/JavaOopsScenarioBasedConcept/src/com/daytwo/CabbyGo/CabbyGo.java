package com.daytwo.CabbyGo;

public class CabbyGo implements IRideService {
	private Vehicle vehicle;
    private Driver driver;
    private boolean isRideActive;

    public CabbyGo(Vehicle vehicle, Driver driver) {
        this.vehicle = vehicle;
        this.driver = driver;
        this.isRideActive = false;
    }

    @Override
    public void bookRide(String pickup, String destination) {
        isRideActive = true;
        System.out.println("Ride Booked!");
        System.out.println("Driver: " + driver.getName() + " is arriving in a " + vehicle.getType());
        System.out.println("Route: " + pickup + " to " + destination);
    }

    @Override
    public void endRide(double distance) {
        if (isRideActive) {
//            double distance = 12.5; // Simulated distance
            double totalFare = vehicle.calculateFare(distance);
            System.out.println("\nRide Ended.");
            System.out.println("Total Distance: " + distance + " km");
            System.out.println("Final Fare: " + totalFare);
            isRideActive = false;
        }
    }

    public void display() {
    	vehicle.display();
    	driver.display();
    }

}
