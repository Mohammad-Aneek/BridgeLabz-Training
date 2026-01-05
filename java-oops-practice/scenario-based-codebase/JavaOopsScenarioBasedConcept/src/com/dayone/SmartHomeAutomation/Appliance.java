package com.dayone.SmartHomeAutomation;

abstract class Appliance implements Controllable {
	private String name;
	private double powerUsage;

	public Appliance(String name, double powerUsage) {
		this.name = name;
		this.powerUsage = powerUsage;
	}

	public double getPower() {
		return powerUsage;
	}

	public String getName() {
		return name;
	}
	
	public void comparePowerWith(Appliance a) {
		if (this.getPower() > a.getPower()) {
			System.out.println(this.getName() + " uses more power than " + a.getName());
		} else if (this.getPower() < a.getPower()) {
			System.out.println(this.getName() + " uses less power than " + a.getName());
		} else {
			System.out.println("Both use equal power.");
		}
	}

}
