package com.dayone.SmartHomeAutomation;

public class Fan extends Appliance {

	public Fan(String name, double power) { 
        super(name, power); 
    }

    @Override
    public void turnOn() {
        System.out.println(getName() + " is spinning now.");
    }

    @Override
    public void turnOff() {
        System.out.println(getName() + " has stopped spinning.");
    }
}
