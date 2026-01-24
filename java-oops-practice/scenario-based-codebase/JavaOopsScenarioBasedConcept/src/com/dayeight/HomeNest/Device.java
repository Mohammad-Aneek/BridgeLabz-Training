package com.dayeight.HomeNest;

abstract public class Device implements IControllable {
	protected String deviceId;
	protected String status;
	protected double energyUsage;

	public Device(String deviceId, double energyUsage) {
		this.deviceId = deviceId;
		this.energyUsage = energyUsage;
		this.status = "OFF";
	}

	public String getStatus() {
		return status;
	}

	protected void logFirmwareUpdate(String version) {
		System.out.println("Log: Device " + deviceId + " updated to " + version);
	}

	public double calculateCost(double hours) {
		return energyUsage * hours * 10;
	}

}
