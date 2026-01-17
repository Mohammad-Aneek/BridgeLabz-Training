package com.daytwo.TrainCompanion;

public class ComapartmentNode {
	protected String name;
	protected CompartementType type;
	protected boolean hasWifi;
	ComapartmentNode previous;
	ComapartmentNode next;

	protected ComapartmentNode(String name, CompartementType type, boolean hasWifi) {
		this.name = name;
		this.type = type;
		this.hasWifi = hasWifi;
	}
}
