package com.inheritance.VehicleManagementSystem;

public class ElectricVehicle extends Vehicle implements Rechargeable {

	public ElectricVehicle(double maxSpeed, String model) {
		super(maxSpeed,model);
	}
	@Override
	public void charge() {
		System.out.println("Vehicle recharged");

	}

}
