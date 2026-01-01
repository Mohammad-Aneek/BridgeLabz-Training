package com.objectmodeling.EcommerceSystem;

import java.util.ArrayList;

class Customer {
	private String name;
    private ArrayList<Order> orderHistory;

    public Customer(String name) {
        this.name = name;
        this.orderHistory = new ArrayList<>();
    }

    public void placeOrder(Order order) {
        orderHistory.add(order);
    }

    public void viewHistory() {
    	System.out.println("-------------------------");
        System.out.println("Order History for " + this.name + ":");
        for (Order order : orderHistory) {
            order.display();
        }
        System.out.println("-------------------------");
    }
}
