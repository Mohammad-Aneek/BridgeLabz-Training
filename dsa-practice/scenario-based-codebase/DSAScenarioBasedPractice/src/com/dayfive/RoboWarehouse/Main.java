package com.dayfive.RoboWarehouse;

public class Main {
	public static void main(String[] args) {
		Warehouse robot = new Warehouse();
        
        robot.loadPackage("Box A", 20.5);
        robot.loadPackage("Box B", 5.0);
        robot.loadPackage("Box C", 12.3);
        robot.loadPackage("Box D", 25.0);
        robot.loadPackage("Box E", 12.3);

        robot.display();
	}
}
