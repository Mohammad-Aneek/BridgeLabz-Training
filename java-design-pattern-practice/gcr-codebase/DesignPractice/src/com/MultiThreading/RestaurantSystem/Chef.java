package com.MultiThreading.RestaurantSystem;

public class Chef extends Thread {
	private String dish;
	private int time;

	public Chef(String name, String dish, int timeInMs) {
		super(name);
		this.dish = dish;
		this.time = timeInMs;
	}

	public void run() {
		System.out.println(getName() + " started preparing " + dish);
		try {
			for (int p = 25; p <= 100; p += 25) {
				Thread.sleep(time / 4);
				System.out.println(getName() + " preparing " + dish + ": " + p + "% complete");
			}
		} catch (InterruptedException e) {
		}
	}
}
