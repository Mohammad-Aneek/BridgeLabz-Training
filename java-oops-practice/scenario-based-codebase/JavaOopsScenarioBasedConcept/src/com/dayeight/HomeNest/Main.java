package com.dayeight.HomeNest;

public class Main {
	public static void main(String[] args) {
		Device thermostat = new Thermostat("T1001", 0.5);
		thermostat.turnOn();
		System.out.println("Thermostat Status: " + thermostat.getStatus());
		System.out.println("Thermostat Cost for 5 hours: $" + thermostat.calculateCost(5));
		thermostat.reset();
		thermostat.turnOff();
		System.out.println("Thermostat Status: " + thermostat.getStatus());

		System.out.println();

		Device light = new Light("L2001", 0.1);
		light.turnOn();
		System.out.println("Light Status: " + light.getStatus());
		System.out.println("Light Cost for 10 hours: $" + light.calculateCost(10));
		light.reset();
		light.turnOff();
		System.out.println("Light Status: " + light.getStatus());
	}
}
