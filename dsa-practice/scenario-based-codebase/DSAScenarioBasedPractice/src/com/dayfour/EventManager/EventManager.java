package com.dayfour.EventManager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EventManager {
	private ArrayList<Ticket> tickets;
	private boolean isSorted;
	private int count = 0;

	public EventManager() {
		// TODO Auto-generated constructor stub
		this.tickets = new ArrayList<Ticket>();
		this.isSorted = true;
	}

	public void addTicket(Ticket ticket) {
		if (ticket != null) {
			tickets.add(ticket);
			count++;
			this.isSorted = false;
		}
	}

	public void sort() {
		if (!isSorted) {
			quickSort(0, count - 1);
			isSorted = true;
		}
	}

	public void quickSort(int i, int j) {
		if (i >= j) {
			return;
		}

		int pivot = i;
		int left = pivot + 1;
		int right = j;

		while (left <= right) {
			Ticket pivotTicket = tickets.get(pivot);
			while (left <= right && pivotTicket.compareTo(tickets.get(left)) <= 0) {
				left++;
			}

			while (left <= right && pivotTicket.compareTo(tickets.get(right)) > 0) {
				right--;
			}

			if (left < right) {
				Collections.swap(tickets, right, left);
			}
		}

		Collections.swap(tickets, right, pivot);

		quickSort(i, right - 1);
		quickSort(right + 1, j);
	}

	public List<Ticket> getTop(int num) {
		sort();
		return tickets.subList(0, Math.min(num, count));
	}

	public List<Ticket> getBottom(int num) {
		sort();
		return tickets.subList(Math.max(0, tickets.size() - num), tickets.size()).reversed();
	}

}
