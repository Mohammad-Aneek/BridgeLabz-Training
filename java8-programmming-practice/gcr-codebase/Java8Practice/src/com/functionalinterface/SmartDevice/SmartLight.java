package com.functionalinterface.SmartDevice;

public class SmartLight implements SmartDevice {

	@Override
	public void turnOn() {
		System.out.println("Light is now ON");
	}

	@Override
	public void turnOff() {
		System.out.println("Light is now OFF");
	}

}
