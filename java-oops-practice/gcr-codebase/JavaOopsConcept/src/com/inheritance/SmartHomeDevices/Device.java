package com.inheritance.SmartHomeDevices;

public class Device {
	protected String deviceID;
	protected String status;
	
	public Device(String deviceID, String status) {
		this.deviceID = deviceID;
		this.status = status;
	}
	
	public void displayStatus() {
		System.out.println("Device ID: " + deviceID);
		System.out.println("Status: " + status);
	}
}
