package com.daythree.ParcelTracker;

import java.util.PriorityQueue;

public class Stage {
	protected String name;
	protected Stage next;
	private PriorityQueue<Parcel> parcels;

	public Stage(String name) {
		this.name = name;
		this.next = null;
		this.parcels = new PriorityQueue<Parcel>();
	}

	protected void addParcel(Parcel p) {
		parcels.add(p);
	}

	protected void processParcel() {
		if (next == null) {
			return;
		} else {
			next.processParcel();
			Parcel p = parcels.poll();
			if (p != null) {
				next.addParcel(p);
			}
		}
	}

	protected Parcel getParcel() {
		return parcels.poll();
	}
}
