package com.dayone.AmbulanceRoute;

public class Ambulance {
	private Hospital head = null;
	private Hospital tail = null;

	public void addUnit(String name) {
		Hospital newNode = new Hospital(name);
		if (head == null) {
			head = newNode;
			tail = newNode;
			newNode.next = head;
		} else {
			tail.next = newNode;
			tail = newNode;
			tail.next = head;
		}
	}

	public boolean assignPatient() {
		if (head == null) {
			return false;
		}

		Hospital current = head;
		do {
			if (!current.isBusy) {
				current.isBusy = true;
				return true;
			}
			current = current.next;
		} while (current != head);
		return false;
	}

}
