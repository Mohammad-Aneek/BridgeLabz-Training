package com.functionalinterface.UnitConversion;

public class Main {
	public static void main(String[] args) {
		double dist = 100;
		System.out.println(dist + " km is " + UnitConverter.kmToMiles(dist) + " miles.");

		double weight = 70;
		System.out.println(weight + " kg is " + UnitConverter.kgToLbs(weight) + " lbs.");
	}
}
