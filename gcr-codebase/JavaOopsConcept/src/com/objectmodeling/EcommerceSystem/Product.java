package com.objectmodeling.EcommerceSystem;

class Product {
	private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String toString() {
        return String.format("%s ($%.2f)", name, price);
    }
}
