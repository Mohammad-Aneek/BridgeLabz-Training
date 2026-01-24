package com.dayfive.CropMonitor;

public class SensorData {
	long timestamp;
	double temperature;

	public SensorData(long timestamp, double temperature) {
		this.timestamp = timestamp;
		this.temperature = temperature;
	}

	@Override
	public String toString() {
		return "Time: " + timestamp + ", Temp: " + temperature;
	}
}
