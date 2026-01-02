package com.inheritance.VehicleManagementSystem;

public class PetrolVehicle extends Vehicle implements Refuelable {

	public PetrolVehicle(double maxSpeed, String model) {
		super(maxSpeed,model);
	}
	@Override
	public void refuel() {
		System.out.println("Vehincle refilled");
	}

}
