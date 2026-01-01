package com.objectmodeling.EcommerceSystem;

public class Main {

	public static void main(String[] args) {
		Customer customer = new Customer("John Doe");
        
		Product p1 = new Product("Laptop", 60000.00);
        Product p2 = new Product("Mouse", 350);
        Product p3 = new Product("Keyboard", 2000);
        
        Order order1 = new Order(101);
        Order order2 = new Order(102);
        
        order1.addProduct(p1);
        order1.addProduct(p2);
        order2.addProduct(p1); 
        order2.addProduct(p3);

        customer.placeOrder(order1);
        customer.placeOrder(order2);

        customer.viewHistory();

	}

}
