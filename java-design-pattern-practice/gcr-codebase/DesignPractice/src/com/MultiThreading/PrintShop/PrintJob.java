package com.MultiThreading.PrintShop;

public class PrintJob implements Runnable {
	private String name;
	private int pages;

	public PrintJob(String name, int pages) {
		this.name = name;
		this.pages = pages;
	}

	@Override
	public void run() {
		for (int i = 1; i <= pages; i++) {
			System.out.println("Printing " + name + " - Page " + i + " of " + pages);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
			}
		}
	}
}
