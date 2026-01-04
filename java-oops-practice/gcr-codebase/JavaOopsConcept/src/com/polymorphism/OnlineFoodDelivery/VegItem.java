package com.polymorphism.OnlineFoodDelivery;

public class VegItem extends FoodItem{
	public VegItem(String name, double price, int quantity) {
        super(name, price, quantity);
    }

    @Override
    public double applyDiscount(double totalAmount) {
        return totalAmount - (totalAmount * 0.05);
    }

    @Override
    public String getDiscountDetails() {
        return "Discount Rate(Veg): 5%";
    }
    
    @Override
    public double calculateTotalPrice() {
        return price * quantity;
    }
}
