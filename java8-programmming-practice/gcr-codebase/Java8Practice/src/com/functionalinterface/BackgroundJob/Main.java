package com.functionalinterface.BackgroundJob;

public class Main {
	public static void main(String[] args) {
		Runnable dbBackup = () -> {
			System.out.println(Thread.currentThread().getName() + " is performing Database Backup...");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println("Backup interrupted: " + e.getMessage());
			}
			System.out.println("Backup Complete.");
		};

		// Start the thread
		new Thread(dbBackup).start();
		System.out.println("Main thread continues working...");
	}
}
