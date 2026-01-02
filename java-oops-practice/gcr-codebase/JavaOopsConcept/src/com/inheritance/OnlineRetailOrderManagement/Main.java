package com.inheritance.OnlineRetailOrderManagement;

public class Main {

	public static void main(String[] args) {
		Order order1 = new Order("1","01-Jan-2026");
		Order order2 = new ShippedOrder("1","01-Jan-2026","123");
		Order order3 = new DeliveredOrder("1","01-Jan-2026","123","05-Jan-2026");
		
		order1.getOrderStatus();
		order2.getOrderStatus();
		order3.getOrderStatus();
	}

}
