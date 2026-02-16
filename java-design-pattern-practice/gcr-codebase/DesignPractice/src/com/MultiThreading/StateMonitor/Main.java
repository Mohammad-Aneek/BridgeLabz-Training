package com.MultiThreading.StateMonitor;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		Thread worker = new Thread(() -> {
			try {
				Thread.sleep(1000);
				for (int i = 0; i < 1000000; i++)
					;
			} catch (InterruptedException e) {
			}
		});

		System.out.println("State 1: " + worker.getState()); // NEW
		worker.start();
		System.out.println("State 2: " + worker.getState()); // RUNNABLE

		Thread.sleep(100);
		System.out.println("State 3: " + worker.getState()); // TIMED_WAITING

		worker.join();
		System.out.println("State 4: " + worker.getState()); // TERMINATED
	}
}
