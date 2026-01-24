package com.daynine.BirdSanctuary;

public abstract class Bird {
	protected String id;
	protected String name;
	protected String species;

	public Bird(String id, String name, String species) {
		this.id = id;
		this.name = name;
		this.species = species;
	}

	public void eat() {
		System.out.println(name + " [" + species + "] is eating food.");
	}

	public String getId() {
		return id;
	}

	@Override
	public String toString() {
		return "ID: " + id + ", " + name + " [" + species + "]";
	}
}
