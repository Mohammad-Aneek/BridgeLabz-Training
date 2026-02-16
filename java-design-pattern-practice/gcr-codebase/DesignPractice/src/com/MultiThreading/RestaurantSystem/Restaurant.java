package com.MultiThreading.RestaurantSystem;

public class Restaurant {
	public static void main(String[] args) throws InterruptedException {
		Chef c1 = new Chef("Chef-1", "Pizza", 3000);
		Chef c2 = new Chef("Chef-2", "Pasta", 2000);

		c1.start();
		c2.start();

		c1.join();
		c2.join();
		System.out.println("Kitchen closed - All orders completed");
	}
}
