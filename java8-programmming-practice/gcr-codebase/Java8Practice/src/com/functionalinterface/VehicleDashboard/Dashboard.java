package com.functionalinterface.VehicleDashboard;

public interface Dashboard {
	void displaySpeed();

	default void displayBattery() {
		System.out.println("Battery info not applicable for this vehicle.");
	}
}
