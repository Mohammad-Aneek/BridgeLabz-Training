package com.polymorphism.OnlineFoodDelivery;

public class NonVegItem extends FoodItem {
	private double packagingFee = 20.0;

    public NonVegItem(String name, double price, int quantity) {
        super(name, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return (price + packagingFee) * quantity;
    }

    @Override
    public double applyDiscount(double totalAmount) {
        return totalAmount;
    }

    @Override
    public String getDiscountDetails() {
        return "Discount Rate (Non Veg): 0%";
    }

}
