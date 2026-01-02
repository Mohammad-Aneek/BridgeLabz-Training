package com.inheritance.VehicleManagementSystem;

public class Main {
	public static void main(String[] args) {
		ElectricVehicle ev = new ElectricVehicle(300, "Tesla Model 3");
		PetrolVehicle pv = new PetrolVehicle(180, "Honda City");

		ev.charge();
		pv.refuel();
	}
}
