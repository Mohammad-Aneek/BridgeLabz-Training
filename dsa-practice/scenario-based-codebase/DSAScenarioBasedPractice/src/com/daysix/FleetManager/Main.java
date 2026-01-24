package com.daysix.FleetManager;

public class Main {
	public static void main(String[] args) {
		Scheduler scheduler = new Scheduler();

		Depot depot1 = new Depot();
		depot1.addVehicle(50000);
		depot1.addVehicle(10000);
		depot1.addVehicle(30000);

		Depot depot2 = new Depot();
		depot2.addVehicle(40000);
		depot2.addVehicle(5000);
		depot2.addVehicle(20000);

		scheduler.addDepot(depot2);
		scheduler.display();

		scheduler.addDepot(depot1);
		scheduler.display();
	}
}
