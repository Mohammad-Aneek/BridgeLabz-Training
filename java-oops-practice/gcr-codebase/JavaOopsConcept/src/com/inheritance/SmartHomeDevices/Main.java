package com.inheritance.SmartHomeDevices;

public class Main {
	public static void main(String[] args) {
		Device device1 = new Thermostat("6969", "working", "normal");
		device1.displayStatus();
	}

}
