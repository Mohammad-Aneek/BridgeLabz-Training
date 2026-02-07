package com.functionalinterface.TemperatureAlert;

import java.util.function.Predicate;

public class Main {
	public static void main(String[] args) {
		Predicate<Double> isCritical = (temp) -> temp > 50.0;

		double currentTemp = 52.5;

		if (isCritical.test(currentTemp)) {
			System.out.println("ALERT! Temperature is critical: " + currentTemp);
		} else {
			System.out.println("Temperature is normal.");
		}
	}
}
