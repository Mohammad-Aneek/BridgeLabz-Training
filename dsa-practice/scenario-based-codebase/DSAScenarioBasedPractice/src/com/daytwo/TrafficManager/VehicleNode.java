package com.daytwo.TrafficManager;

public class VehicleNode {
	String plateNumber;
	VehicleNode next;

	public VehicleNode(String plateNumber) {
		this.plateNumber = plateNumber;
		this.next = null;
	}

	@Override
	public String toString() {
		return plateNumber;
	}
}
