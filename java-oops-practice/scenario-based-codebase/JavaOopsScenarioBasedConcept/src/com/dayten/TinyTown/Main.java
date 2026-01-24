package com.dayten.TinyTown;

public class Main {

	public static void main(String[] args) {
		Bag sportsBag = new Bag("B001", "Red", 3);

		Ball b1 = new Ball("X10", "Green", "Small");
		Ball b2 = new Ball("X11", "Blue", "Medium");
		Ball b3 = new Ball("X12", "Yellow", "Large");
		Ball b4 = new Ball("X13", "White", "Small");

		sportsBag.addBall(b1);
		sportsBag.addBall(b2);
		sportsBag.addBall(b3);
		sportsBag.addBall(b4);

		sportsBag.displayContent();

		sportsBag.removeBall("X11");
		sportsBag.addBall(b4);

		sportsBag.displayContent();
	}

}
