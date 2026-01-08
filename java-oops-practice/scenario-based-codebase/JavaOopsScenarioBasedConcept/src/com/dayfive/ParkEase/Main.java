package com.dayfive.ParkEase;

import java.time.Duration;

public class Main {

	public static void main(String[] args) {
		ParkingSlot bikeSlot = new ParkingSlot("S1", VehicleType.Bike);
        ParkingSlot carSlot = new ParkingSlot("S2", VehicleType.Car);
        ParkingSlot truckSlot = new ParkingSlot("S3", VehicleType.Truck);

        Bike bike = new Bike("B01");
        Car car = new Car("C01");
        Truck truck = new Truck("T01");

        bikeSlot.assignVehicle(bike);
        carSlot.assignVehicle(truck);
        carSlot.assignVehicle(car);
        truckSlot.assignVehicle(truck);

        System.out.println("Bike Fee (3 hrs): " + bike.calculateCharges(Duration.ofHours(3)));
        System.out.println("Car Fee (6 hrs): " + car.calculateCharges(Duration.ofHours(6)));
        System.out.println("Truck Fee (10 hrs): " + truck.calculateCharges(Duration.ofHours(10)));
        
        bikeSlot.freeSlot();
        carSlot.freeSlot();
        truckSlot.freeSlot();
	}

}
