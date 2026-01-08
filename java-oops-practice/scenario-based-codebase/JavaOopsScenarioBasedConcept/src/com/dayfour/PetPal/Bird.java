package com.dayfour.PetPal;

public class Bird extends Pet {
	public Bird(String name) {
		super(name, "Bird");
	}

	@Override
	public void makeSound() {
		System.out.println(name + " says: Chirp Chirp!");
	}
}
