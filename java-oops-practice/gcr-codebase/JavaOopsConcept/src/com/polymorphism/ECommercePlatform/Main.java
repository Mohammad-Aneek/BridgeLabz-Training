package com.polymorphism.ECommercePlatform;

public class Main {

	public static void main(String[] args) {
		Product laptop = new Electronics("E1", "Laptop", 60000, 24);
		Product tShirt = new Clothing("C1", "T-Shirt", 1500, "M");
		Product apple = new Groceries("G1", "Apple", 50, "10-Jan");

		System.out.println("---------------------------");
		laptop.displayDetails();
		System.out.println("---------------------------");
		tShirt.displayDetails();
		System.out.println("---------------------------");
		apple.displayDetails();
	}

}
