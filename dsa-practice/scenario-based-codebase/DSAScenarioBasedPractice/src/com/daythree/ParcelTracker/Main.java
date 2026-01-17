package com.daythree.ParcelTracker;

public class Main {
	public static void main(String[] args) {
		Courier delhivery = new Courier("delhivery");

		delhivery.addCheckpointAtLast("Packed", false);
		delhivery.addCheckpointAtLast("Delivered", true);

		delhivery.addCheckpoint("Hub Processing", 1);
		delhivery.addCheckpoint("Out for Delivery", 2);

		delhivery.addParcel("Aneek", "Anandnagar", "02-02-2026", Priority.STANDARD);
		delhivery.addParcel("Abhishek", "Satna", "01-14-2026", Priority.OVERNIGHT);
		delhivery.addParcel("Darshika", "Jabalpur", "01-18-2026", Priority.EXPRESS);

		delhivery.processParcels();
		delhivery.processParcels();
		delhivery.processParcels();
		delhivery.processParcels();

		delhivery.displayDelivered();
	}
}
