package com.inheritance.SmartHomeDevices;

public class Thermostat extends Device {
	private String temperatureSetting;

	public Thermostat(String deviceId, String status, String temperatureSetting) {
		super(deviceId, status);
		this.temperatureSetting = temperatureSetting;
	}

	@Override
	public void displayStatus() {
		super.displayStatus();
		System.out.println("Temperature Setting: " + temperatureSetting);

	}
}
