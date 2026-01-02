package com.inheritance.RestaurantManagementSystem;

public class Waiter extends Person implements Worker {
	public Waiter(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println(super.name + " is serving food");
    }
}
