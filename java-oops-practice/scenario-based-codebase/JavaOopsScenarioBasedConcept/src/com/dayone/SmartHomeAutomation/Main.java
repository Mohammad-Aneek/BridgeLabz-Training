package com.dayone.SmartHomeAutomation;

public class Main {
	public static void main(String[] args) {
		Appliance light = new Light("light", 10.0);
		Appliance fan = new Fan("fan", 75.0);
		Appliance roomAC = new AC("AC", 1800.0);

		light.turnOn();
		fan.turnOn();
		roomAC.turnOn();

		roomAC.comparePowerWith(fan);
		light.comparePowerWith(fan);
	}

	
}
