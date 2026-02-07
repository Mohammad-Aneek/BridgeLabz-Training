package com.functionalinterface.SmartDevice;

class AirConditioner implements SmartDevice {
	@Override
	public void turnOn() {
		System.out.println("AC is cooling the room");
	}

	@Override
	public void turnOff() {
		System.out.println("AC is turned OFF");
	}
}
