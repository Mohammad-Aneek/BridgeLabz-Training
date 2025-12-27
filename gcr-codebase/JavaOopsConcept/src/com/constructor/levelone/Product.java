package com.constructor.levelone;

class Product {
	private String productName;
	private double price;
	private static int totalProducts;
	
	public Product(String productName, double price) {
		this.productName = productName;
		this.price = price;
		Product.totalProducts++;
	}
	
	public void displayProductDetails() {
		System.out.println("Product name: " + productName);
		System.out.println("Price: " + price);
	}
	
	public void displayTotalProducts() {
		System.out.println("The total number of products created is " + totalProducts);
	}
}
