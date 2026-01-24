package com.dayten.TinyTown;

import java.util.ArrayList;

public class Bag {
	private String id;
	private String color;
	private int capacity;
	private ArrayList<Ball> balls;

	public Bag(String id, String color, int capacity) {
		this.id = id;
		this.color = color;
		this.capacity = capacity;
		this.balls = new ArrayList<>();
	}

	public void addBall(Ball ball) {
		if (balls.size() < capacity) {
			balls.add(ball);
			System.out.println("Ball added successfully");
		} else {
			System.out.println("Ball addition failed");
		}
	}

	public void removeBall(String ballId) {
		boolean removed = balls.removeIf(b -> b.getId().equals(ballId));
		if (removed) {
			System.out.println("Ball removed successfully");
		} else {
			System.out.println("Ball removal failed");
		}
	}

	public void displayContent() {
		System.out.println("Bag ID: " + id);
		System.out.println("Color: " + color);
		System.out.println("Capacity: " + balls.size() + "/" + capacity);

		if (balls.isEmpty()) {
			System.out.println("(Bag is empty)");
		} else {
			for (Ball b : balls) {
				System.out.println(b.getDetails());
			}
		}
	}
}
