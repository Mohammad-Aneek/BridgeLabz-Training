package com.polymorphism.OnlineFoodDelivery;

abstract class FoodItem implements Discountable {
	private String itemName;
	protected double price;
	protected int quantity;

	public FoodItem(String itemName, double price, int quantity) {
		this.itemName = itemName;
		this.price = price;
		this.quantity = quantity;
	}

	public abstract double calculateTotalPrice();

	public void displayDetails() {
		double baseTotal = calculateTotalPrice();
		double finalPrice = applyDiscount(baseTotal);

		System.out.println("Item name: " + itemName);
		System.out.println("Item price: " + price);
		System.out.println("Item quantity: " + quantity);
		System.out.println("Bill value: " + baseTotal);
		System.out.println(getDiscountDetails());
		System.out.println("Final price: " + finalPrice);
	}

}
