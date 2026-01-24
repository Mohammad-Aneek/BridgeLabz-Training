package com.dayeight.FoodFest;

public class Main {
	public static void main(String[] args) {
		Zone zone1 = new Zone("Zone A");
		zone1.addStall(new Stall(101, 500));
		zone1.addStall(new Stall(102, 300));
		zone1.addStall(new Stall(103, 700));

		Zone zone2 = new Zone("Zone B");
		zone2.addStall(new Stall(201, 600));
		zone2.addStall(new Stall(202, 400));
		zone2.addStall(new Stall(203, 800));

		Organizer organizer = new Organizer();
		organizer.addZone(zone1);
		organizer.addZone(zone2);
		organizer.displayAllStalls();

	}
}