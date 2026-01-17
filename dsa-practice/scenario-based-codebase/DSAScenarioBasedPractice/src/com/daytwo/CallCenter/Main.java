package com.daytwo.CallCenter;

public class Main {
	public static void main(String[] args) {
		CallCenter center = new CallCenter("Acer Centre");

		Customer c1 = new Customer("Aneek", "101", Status.Platinum);
		Customer c2 = new Customer("Abhishek", "102", Status.Gold);
		Customer c3 = new Customer("Anurag", "103", Status.Regular);
		Customer c4 = new Customer("Ansh", "104", Status.Regular);
		Customer c5 = new Customer("Darshika", "105", Status.Silver);

		center.addToQueue(c3);
		center.addToQueue(c2);
		center.addToQueue(c4);
		center.addToQueue(c1);
		center.addToQueue(c5);
		center.addToQueue(c1);

		center.displayRecords();

		center.proceedQueue();
		center.proceedQueue();
		center.proceedQueue();
		center.proceedQueue();
		center.proceedQueue();
		center.proceedQueue();
		
		center.addToQueue(c2);
		center.addToQueue(c4);
		center.addToQueue(c1);
		
		center.displayRecords();

	}
}
