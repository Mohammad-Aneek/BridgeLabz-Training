package com.daythree.ParcelTracker;

public class Courier {
	private String name;

	Stage start;
	Stage end;
	private int length = 0;

	private boolean isCompleted;

	public Courier(String name) {
		this.name = name;
		this.start = null;
		this.end = null;
		this.isCompleted = false;
	}

	public void addParcel(String senderName, String shippingAddress, String date, Priority priority) {
		if (start != null && isCompleted) {
			start.addParcel(new Parcel(senderName, shippingAddress, date, priority));
		}
	}

	public boolean addCheckpointAtLast(String name, boolean isFinal) {
		if (isCompleted) {
			return false;
		} else {
			if (start == null) {
				start = end = new Stage(name);
			} else {
				end.next = new Stage(name);
				end = end.next;
			}
			length++;
			this.isCompleted = isFinal;
			return true;
		}
	}

	public boolean addCheckpoint(String name, int position) {
		if (position == length) {
			return addCheckpointAtLast(name, false);
		} else if (position == 0) {
			Stage newStage = new Stage(name);
			newStage.next = start;
			start = newStage;
		} else {
			Stage temp = start;
			while (position > 1) {
				temp = temp.next;
			}
			Stage newStage = new Stage(name);
			newStage.next = temp.next;
			temp.next = newStage;
		}
		return true;
	}

	public void processParcels() {
		if (start != null && isCompleted) {
			start.processParcel();
		}
	}

	public void displayDelivered() {
		if (!isCompleted) {
			System.out.println("Chain incomplete! Missing parcels");
		} else {
			System.out.println(name);
			Parcel p = end.getParcel();
			System.out.println("Delivered Parcels: ");
			while (p != null) {
				System.out.println(p);
				p = end.getParcel();
			}
		}
	}
}
