package com.dayfour.PetPal;

abstract class Pet implements IInteractable {
	protected String name;
	protected String type;
	protected int age;
	private int hunger;
	private int mood;
	private int energy;

	public Pet(String name, String type) {
		this.name = name;
		this.type = type;
		this.age = 1;
		this.hunger = 50;
		this.mood = 50;
		this.energy = 50;
	}

	public abstract void makeSound();

	protected void adjustStat(int hunger, int mood, int energy) {
		this.hunger = Math.max(0, Math.min(100, this.hunger + hunger));
		this.mood = Math.max(0, Math.min(100, this.mood + mood));
		this.energy = Math.max(0, Math.min(100, this.energy + energy));
	}

	@Override
	public void feed() {
		adjustStat(-20, 10, 5);
	}

	@Override
	public void play() {
		adjustStat(10, 20, -15);
	}

	@Override
	public void sleep() {
		adjustStat(5, 5, 30);
	}

	public void displayDetails() {
		System.out.println("Name: " + name);
		System.out.println("Type: " + type);
		System.out.println("Age: " + age);
		System.out.println("Hunger: " + hunger);
		System.out.println("Mood: " + mood);
		System.out.println("Energy: " + energy);

	}

	public void interactWithPet() {
		this.makeSound();
		this.displayDetails();
		this.feed();
		this.play();
		this.displayDetails();
		System.out.println();
	}
}
