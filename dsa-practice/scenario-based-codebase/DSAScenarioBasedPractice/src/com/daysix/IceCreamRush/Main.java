package com.daysix.IceCreamRush;

public class Main {
	public static void main(String[] args) {
		Shop shop = new Shop(8);

		shop.addFlavor("Vanilla", 120);
		shop.addFlavor("Chocolate", 200);
		shop.addFlavor("Strawberry", 85);
		shop.addFlavor("Mint Chip", 95);
		shop.addFlavor("Cookie Dough", 150);
		shop.addFlavor("Rocky Road", 60);
		shop.addFlavor("Coffee", 110);
		shop.addFlavor("Pistachio", 40);

		shop.display();
		shop.sort();
		shop.display();
	}
}
