package com.dayfour.EventManager;

import java.util.List;

public class Main {
	public static void main(String[] args) {
		EventManager manager = new EventManager();
		manager.addTicket(new Ticket(500));
		manager.addTicket(new Ticket(5000));
		manager.addTicket(new Ticket(2000));
		manager.addTicket(new Ticket(3000));
		manager.addTicket(new Ticket(200));
		manager.addTicket(new Ticket(1500));
		manager.addTicket(new Ticket(1800));
		manager.addTicket(new Ticket(800));
		manager.addTicket(new Ticket(3500));

		manager.sort();
		List<Ticket> top = manager.getTop(5);
		List<Ticket> bottom = manager.getBottom(5);

		display(manager.getTop(100));
		System.out.println("---------");

		display(top);
		System.out.println("----------");
		display(bottom);

	}

	public static void display(List<Ticket> list) {
		for (Ticket ticket : list) {
			System.out.println(ticket);
		}
	}
}
