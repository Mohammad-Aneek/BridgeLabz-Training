package com.functionalinterface.SmartDevice;

public class Main {
	public static void main(String[] args) {
		SmartDevice light = new SmartLight();
		light.turnOn();
		light.turnOff();

		SmartDevice ac = new AirConditioner();
		ac.turnOn();
		ac.turnOff();
	}
}
