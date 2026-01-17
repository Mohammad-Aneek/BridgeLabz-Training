package com.daytwo.CallCenter;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class CallCenter {
	private String name;
	private Queue<Customer> queue;
	private PriorityQueue<Customer> priorityQueue;
	private HashMap<Customer, Integer> records;

	public CallCenter(String name) {
		this.name = name;
		this.queue = new LinkedList<Customer>();
		this.priorityQueue = new PriorityQueue<Customer>();
		this.records = new HashMap<Customer, Integer>();
	}

	public void addToQueue(Customer customer) {
		if (customer.getStatus() == Status.Regular) {
			if (!queue.contains(customer)) {
				queue.offer(customer);
			} else {
				System.out.println("Customer Already in queue");
				return;
			}
		} else {
			if (!priorityQueue.contains(customer)) {
				priorityQueue.offer(customer);
			} else {
				System.out.println("Customer Already in priority queue");
				return;
			}
		}

		System.out.println("Added to queue");
		records.putIfAbsent(customer, 0);
		records.put(customer, records.get(customer) + 1);
	}

	public void proceedQueue() {
		if (!priorityQueue.isEmpty()) {
			Customer customer = priorityQueue.poll();
			System.out.println(customer + " priority proceed");
		} else if (!queue.isEmpty()) {
			Customer customer = queue.remove();
			System.out.println(customer + " regualar proceed");
		} else {
			System.out.println("No one in the queue");
		}
	}

	public void displayRecords() {
		System.out.println(name + " Records");
		for (Map.Entry<Customer, Integer> record : records.entrySet()) {
			System.out.println(record.getKey() + " -> " + record.getValue());
		}
	}
}
