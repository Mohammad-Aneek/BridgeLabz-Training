package com.daynine.BirdSanctuary;

public class Ostrich extends Bird {
	public Ostrich(String id, String name) {
		super(id, name, "Ostrich");
	}

	@Override
	public void eat() {
		System.out.println(name + " the ostrich is eating.");
	}
}
