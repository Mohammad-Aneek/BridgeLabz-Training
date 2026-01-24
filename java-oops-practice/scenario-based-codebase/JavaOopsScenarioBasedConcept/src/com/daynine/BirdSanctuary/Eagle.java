package com.daynine.BirdSanctuary;

public class Eagle extends Bird implements Flyable {
	public Eagle(String id, String name) {
		super(id, name, "Eagle");
	}

	@Override
	public void fly() {
		System.out.println(name + " the eagle is flying.");
	}

}
