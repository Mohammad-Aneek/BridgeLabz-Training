package com.stackandqueue.QueueUsingStack;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		QueueImplementation queue = new QueueImplementation();
		Scanner input = new Scanner(System.in);
		boolean running = true;

		System.out.println("Queue Using Two Stacks");

		while (running) {
			System.out.println("\nSelect an operation:");
			System.out.println("1. Offer\n2. Poll\n3. Peek\n4. Exit");
			System.out.print("Enter choice: ");

			int choice = Integer.parseInt(input.nextLine());

			switch (choice) {
			case 1 -> {
				System.out.print("Enter a string to add: ");
				if (queue.offer(input.nextLine())) {
					System.out.println("Successfully added string");
				}
			}
			case 2 -> {

				String removed = queue.poll();
				if (removed != null) {
					System.out.println("Polled item: " + removed);
				} else {
					System.out.println("Queue is empty! Cannot poll.");
				}
			}
			case 3 -> {

				String front = queue.peek();
				if (front != null) {
					System.out.println("Front item is: " + front);
				} else {
					System.out.println("Queue is empty!");
				}
			}
			case 4 -> {

				System.out.println("Exiting program...");
				input.close();
				return;
			}
			default -> {
				System.out.println("Invalid option. Please enter 1-4.");
			}
			}
		}

	}
}
