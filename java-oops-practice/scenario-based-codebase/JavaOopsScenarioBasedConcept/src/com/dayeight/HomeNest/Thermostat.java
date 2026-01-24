package com.dayeight.HomeNest;

public class Thermostat extends Device {

	public Thermostat(String deviceId, double energyUsage) {
		super(deviceId, energyUsage);
	}

	@Override
	public void turnOn() {
		this.status = "ACTIVE";
		System.out.println("Thermostat " + deviceId + " heating/cooling started.");
	}

	@Override
	public void turnOff() {
		this.status = "IDLE";
		System.out.println("Thermostat " + deviceId + " is now IDLE.");
	}

	@Override
	public void reset() {
		System.out.println("Thermostat " + deviceId + " reset to 70.0F.");
	}

}
