package com.objectmodeling.EcommerceSystem;

import java.util.ArrayList;

class Order {
	private int orderId;
    private ArrayList<Product> products;
    private double totalAmount;

    public Order(int orderId) {
        this.orderId = orderId;
        this.products = new ArrayList<>();
        this.totalAmount = 0.0;
    }

    public void addProduct(Product product) {
        products.add(product);
        totalAmount += product.getPrice();
    }

    public void display() {
    	System.out.println("-------------------------");
        System.out.println("Order ID: " + orderId);
        System.out.println("Products:");
        for (Product product : products) {
            System.out.println("  - " + product);
        }
        
        System.out.printf("Total: %.2f%n", totalAmount);
        System.out.println("-------------------------");
    }
    
    public int getId() {
        return orderId;
    }
}
