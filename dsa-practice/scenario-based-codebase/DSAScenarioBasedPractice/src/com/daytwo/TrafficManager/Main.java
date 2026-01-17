package com.daytwo.TrafficManager;

public class Main {
	public static void main(String[] args) {
		System.out.println("=== SMART CITY ROUNDABOUT SIMULATION ===\n");

		TrafficRoundabout system = new TrafficRoundabout();

		system.addVehicle("A");
		system.addVehicle("B");
		system.addVehicle("C");
		system.addVehicle("D");
		system.addVehicle("E");
		system.displayState();

		system.addVehicle("F");
		system.addVehicle("G");
		system.displayState();

		System.out.println(system.removeVehicle() + " removed");
		system.displayState();

		while (system.roundaboutHead != null) {
			system.removeVehicle();
		}
		system.displayState();
	}
}
