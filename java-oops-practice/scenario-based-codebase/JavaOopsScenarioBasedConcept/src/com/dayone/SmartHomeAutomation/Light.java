package com.dayone.SmartHomeAutomation;

public class Light extends Appliance {
	public Light(String name, double power) {
		super(name, power);
	}

	public void turnOn() {
		System.out.println(getName() + " is glowing brightly.");
	}

	public void turnOff() {
		System.out.println(getName() + " is now dark.");
	}

}
