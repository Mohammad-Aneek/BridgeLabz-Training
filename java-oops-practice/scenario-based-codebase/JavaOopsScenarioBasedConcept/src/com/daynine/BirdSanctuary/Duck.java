package com.daynine.BirdSanctuary;

public class Duck extends Bird implements Flyable, Swimmable {
	public Duck(String id, String name) {
		super(id, name, "Duck");
	}

	@Override
	public void fly() {
		System.out.println(name + " the duck is flying.");
	}

	@Override
	public void swim() {
		System.out.println(name + " the duck is swimming.");
	}

}
