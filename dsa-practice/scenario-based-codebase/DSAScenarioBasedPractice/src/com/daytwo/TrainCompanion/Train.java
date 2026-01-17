package com.daytwo.TrainCompanion;

import java.util.HashMap;

public class Train {
	private String name;
	private ComapartmentNode currentCompartment;
	private HashMap<CompartementType, Integer> compartmentRecord;
	private HashMap<CompartementType, ComapartmentNode> compartmentTail;

	public Train(String name) {
		this.name = name;
		compartmentRecord = new HashMap<CompartementType, Integer>();
		compartmentTail = new HashMap<CompartementType, ComapartmentNode>();
		initializeTrain();
		currentCompartment = compartmentTail.get(CompartementType.Engine).next;
	}

	public void display() {
		System.out.println(name);
		System.out.println();
		System.out.printf("%26s %26s %26s%n", currentCompartment.previous.type.toString(),
				currentCompartment.type.toString(), currentCompartment.next.type.toString());
		System.out.printf("%26s %26s %26s%n", currentCompartment.previous.name, currentCompartment.name,
				currentCompartment.next.name);
	}

	public boolean goForward() {
		if (currentCompartment.next.type != CompartementType.Guard) {
			currentCompartment = currentCompartment.next;
			return true;
		} else {
			return false;
		}
	}

	public boolean goBackward() {
		if (currentCompartment.previous.type != CompartementType.Engine) {
			currentCompartment = currentCompartment.previous;
			return true;
		} else {
			return false;
		}
	}

	public boolean addCompartment(CompartementType type, boolean hasWifi) {
		if (type == CompartementType.Engine || type == CompartementType.Guard) {
			return false;
		}

		ComapartmentNode temp = getCompartment(type, hasWifi);
		ComapartmentNode tail = compartmentTail.get(type);

		temp.next = tail.next;
		temp.previous = tail;

		tail.next = temp;
		temp.next.previous = temp;

		compartmentTail.put(type, temp);

		return true;
	}

	public boolean removeCompartment(CompartementType type) {
		if (type == CompartementType.Engine || type == CompartementType.Guard || compartmentRecord.get(type) == 1) {
			return false;
		}

		ComapartmentNode tail = compartmentTail.get(type);
		tail.previous.next = tail.next;
		tail.next.previous = tail.previous;
		if (currentCompartment == tail) {
			currentCompartment = tail.previous;
		}
		compartmentRecord.put(type, compartmentRecord.get(type) - 1);
		compartmentTail.put(type, tail.previous);
		return true;
	}

	private ComapartmentNode getCompartment(CompartementType type, boolean hasWifi) {
		compartmentRecord.putIfAbsent(type, 0);
		int number = compartmentRecord.get(type) + 1;
		compartmentRecord.put(type, number);
		return new ComapartmentNode(type.toString() + " " + number, type, hasWifi);
	}

	private void initializeTrain() {
		ComapartmentNode temp = new ComapartmentNode("Engine", CompartementType.Engine, true);
		compartmentTail.put(CompartementType.Engine, temp);
		CompartementType[] types = { CompartementType.AC, CompartementType.Pantry, CompartementType.Sleeper,
				CompartementType.Sitting, CompartementType.General, CompartementType.Guard };

		for (CompartementType compartementType : types) {
			temp.next = getCompartment(compartementType, true);
			temp.next.previous = temp;
			temp = temp.next;
			compartmentTail.put(compartementType, temp);
		}
	}
}
