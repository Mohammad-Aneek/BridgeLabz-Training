package com.dayeight.HomeNest;

public class Light extends Device {

	public Light(String deviceId, double energyUsage) {
		super(deviceId, energyUsage);
	}

	@Override
	public void turnOn() {
		this.status = "ON";
		System.out.println("Light " + deviceId + " is ON. Brightness: 100%");
	}

	@Override
	public void turnOff() {
		this.status = "OFF";
		System.out.println("Light " + deviceId + " is OFF.");
	}

	@Override
	public void reset() {
		System.out.println("Light " + deviceId + " reset to 50% brightness.");
	}

}
