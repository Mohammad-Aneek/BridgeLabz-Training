package com.inheritance.RestaurantManagementSystem;

public class Main {

	public static void main(String[] args) {
		Worker chef = new Chef("Chef Bhaiya", 1);
        Worker waiter = new Waiter("Waiter Bhaiya", 2);
        
        chef.performDuties();
        waiter.performDuties();
	}

}
