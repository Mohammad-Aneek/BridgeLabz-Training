package com.daytwo.TrainCompanion;

public class Main {
	public static void main(String[] args) {
		Train train = new Train("Amarkantak Express");

		train.display();

		train.goForward(); // to Pantry
		train.display();

		train.goForward(); // to sleeper
		train.display();

		System.out.println("Added Sleeper Coach: " + train.addCompartment(CompartementType.Sleeper, true));

		train.goForward(); // to sleeper 2
		train.display();

		train.goBackward(); // to Sleeper 1
		train.goBackward(); // to Pantry 1
		train.display();

		System.out.println("Removed Sleeper Coach: " + train.removeCompartment(CompartementType.Sleeper));

		System.out.println("Removed Pantry: " + train.removeCompartment(CompartementType.Pantry));

		while (train.goBackward())
			;

		System.out.println("Entered Engine: " + train.goBackward());

		while (train.goForward())
			;

		System.out.println("Entered Guard: " + train.goForward());
	}
}
