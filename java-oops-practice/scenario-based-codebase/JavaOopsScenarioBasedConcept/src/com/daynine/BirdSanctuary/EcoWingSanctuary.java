package com.daynine.BirdSanctuary;

import java.util.ArrayList;

public class EcoWingSanctuary {
	private ArrayList<Bird> birdList;

	public EcoWingSanctuary() {
		this.birdList = new ArrayList<Bird>();
	}

	public void addBird(Bird bird) {
		birdList.add(bird);
	}

	public void removeBird(String id) {
		boolean removed = birdList.removeIf(b -> b.getId().equalsIgnoreCase(id));
		if (removed) {
			System.out.println("Success: Bird with ID " + id + " removed.");
		} else {
			System.out.println("Error: Bird ID not found.");
		}
	}

	public void displayAllBirds() {
		System.out.println("Bird List: ");
		for (Bird b : birdList) {
			System.out.println(b);
			b.eat();

			if (b instanceof Flyable) {
				((Flyable) b).fly();
			}
			if (b instanceof Swimmable) {
				((Swimmable) b).swim();
			}
		}
	}

	public void displayByAbility(String ability) {
		System.out.println(" Birds that can " + ability + ": ");
		for (Bird b : birdList) {
			if (ability.equals("Fly") && b instanceof Flyable) {
				System.out.println(b);
				((Flyable) b).fly();
			} else if (ability.equals("Swim") && b instanceof Swimmable) {
				System.out.println(b);
				((Swimmable) b).swim();
			}
		}
	}

	public void generateReport() {
		int flyers = 0, swimmers = 0, both = 0, neither = 0;

		for (Bird b : birdList) {
			boolean isFlyer = b instanceof Flyable;
			boolean isSwimmer = b instanceof Swimmable;

			if (isFlyer && isSwimmer) {
				both++;
			} else if (isFlyer) {
				flyers++;
			} else if (isSwimmer) {
				swimmers++;
			} else {
				neither++;
			}
		}

		System.out.println("Sanctuary Report: ");
		System.out.println("Total Birds: " + birdList.size());
		System.out.println("Flyers (Only): " + flyers);
		System.out.println("Swimmers (Only): " + swimmers);
		System.out.println("Amphibious (Both): " + both);
		System.out.println("Ground Dwellers (Neither): " + neither);
	}
}
