package com.daynine.BirdSanctuary;

public class Penguin extends Bird implements Swimmable {
	public Penguin(String id, String name) {
		super(id, name, "Penguin");
	}

	@Override
	public void swim() {
		System.out.println(name + " the penguin is swimming.");
	}

}
