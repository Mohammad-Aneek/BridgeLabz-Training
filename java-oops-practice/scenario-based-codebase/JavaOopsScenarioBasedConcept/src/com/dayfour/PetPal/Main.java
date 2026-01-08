package com.dayfour.PetPal;

public class Main {
	public static void main(String[] args) {
		Pet myDog = new Dog("DOggy");
		Pet myCat = new Cat("Catty");
		Pet myBird = new Bird("Tweety");

		myDog.interactWithPet();
		myCat.interactWithPet();
		myBird.interactWithPet();
	}
}
