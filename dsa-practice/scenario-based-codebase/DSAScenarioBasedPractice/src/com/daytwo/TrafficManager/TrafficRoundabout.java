package com.daytwo.TrafficManager;

public class TrafficRoundabout {
	protected int vehicleCount;

	// for the circular linkedlist representing roundabout
	protected VehicleNode roundaboutHead;
	protected VehicleNode roundaboutTail;

	// for the wait queue
	protected VehicleNode queueHead;
	protected VehicleNode queueTail;

	public TrafficRoundabout() {
		this.vehicleCount = 0;

		this.roundaboutHead = null;
		this.roundaboutTail = null;

		this.queueHead = null;
		this.queueTail = null;
	}

	// to add a vehicle to queue and if space available to the roundabout
	public void addVehicle(String plateNumber) {
		VehicleNode vehicle = new VehicleNode(plateNumber);
		if (this.queueHead == null) {
			this.queueHead = vehicle;
			this.queueTail = vehicle;
		} else {
			this.queueTail.next = vehicle;
			this.queueTail = vehicle;
		}
		this.proceedQueue();
	}

	// to remove vehicle from roundabout
	public VehicleNode removeVehicle() {
		VehicleNode vehicle;
		if (roundaboutHead == null) {
			return null;
		} else if (roundaboutHead == roundaboutTail) {
			vehicle = roundaboutHead;
			roundaboutHead = roundaboutTail = null;
			vehicleCount--;
		} else {
			vehicle = roundaboutHead;
			roundaboutHead = roundaboutHead.next;
			roundaboutTail.next = roundaboutHead;
			vehicleCount--;
		}

		proceedQueue();
		return vehicle;
	}

	// to proceed vehicles from queue to roundabout
	protected boolean proceedQueue() {
		if (vehicleCount < 5 && this.queueHead != null) {
			// polling the element form queue
			VehicleNode vehicle = this.queueHead;
			this.queueHead = this.queueHead.next;
			if (this.queueHead == null) {
				this.queueTail = null;
			}

			if (roundaboutHead == null) {
				roundaboutHead = roundaboutTail = vehicle;
				vehicle.next = vehicle;
			} else {
				// add to tail of a circular linkedList
				this.roundaboutTail.next = vehicle;
				this.roundaboutTail = vehicle;
				vehicle.next = this.roundaboutHead;
			}
			vehicleCount++;
			return true;
		} else {
			return false;
		}
	}

	// to display roundabout state
	public void displayState() {
		if (roundaboutHead == null) {
			System.out.println("No vehicles");
			return;
		}
		VehicleNode temp = roundaboutHead;
		System.out.println("Roundabout status: ");
		do {
			System.out.print("\t\t");
			System.out.println(temp);
			temp = temp.next;
		} while (temp != roundaboutHead);
		temp = queueHead;

		if (temp == null) {
			return;
		}
		System.out.println("Waiting queue: ");
		while (temp != null) {
			System.out.print("\t\t");
			System.out.println(temp);
			temp = temp.next;
		}

	}

}
