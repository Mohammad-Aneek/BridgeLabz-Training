package com.dayone.SmartHomeAutomation;

public class AC extends Appliance {

	public AC(String name, double power) {
		super(name, power);
	}

	public void turnOn() {
		System.out.println(getName() + " is blowing cold air.");
	}

	public void turnOff() {
		System.out.println(getName() + " is shutting down vents.");
	}
}
