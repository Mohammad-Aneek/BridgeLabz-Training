package com.dayfive.ParkEase;

public class ParkingSlot {
	private String slotID;
	private boolean isOccupied;
	private VehicleType vehicleTypeAllowed;
	private Vehicle currentVehicle;

	public ParkingSlot(String slotID, VehicleType vehicleTypeAllowed) {
		this.slotID = slotID;
		this.vehicleTypeAllowed = vehicleTypeAllowed;
		this.isOccupied = false;
	}

	public boolean assignVehicle(Vehicle vehicle) {
		if (this.isOccupied) {
			System.out.println("Slot already occupied.");
			return false;
		} else if (vehicle.getVehicleType() != this.vehicleTypeAllowed) {
			System.out.println("Vehicle not allowed");
			return false;
		} else {
			this.isOccupied = true;
			this.currentVehicle = vehicle;
			System.out.println("Vehicle parked successfully");
			return true;
		}
	}

	public boolean isAvailable() {
		return !isOccupied;
	}

	public void freeSlot() {
		if (isOccupied) {
			System.out.println("Vehicle in Slot " + slotID + " left");
			this.currentVehicle = null;
			this.isOccupied = false;
		} else {
			System.out.println("Slot " + slotID + " is already empty.");
		}
	}

	public void getDetails() {
		if (isOccupied) {
			System.out.println("Slot " + slotID + " occupied by " + currentVehicle.getRegistrationNumber());
		}
	}

	public String getSlotID() {
		return slotID;
	}

	public Vehicle getCurrentVehicle() {
		return currentVehicle;
	}
}
