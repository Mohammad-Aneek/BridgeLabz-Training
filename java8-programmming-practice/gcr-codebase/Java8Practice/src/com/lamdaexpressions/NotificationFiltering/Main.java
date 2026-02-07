package com.lamdaexpressions.NotificationFiltering;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Main {
	public static void main(String[] args) {
		ArrayList<Alert> alerts = new ArrayList<Alert>();
		alerts.add(new Alert("CRITICAL", "Heart rate abnormal"));
		alerts.add(new Alert("INFO", "Scheduled for X-ray"));
		alerts.add(new Alert("CRITICAL", "Blood pressure low"));
		alerts.add(new Alert("WARNING", "Medication due in 30 mins"));
		alerts.add(new Alert("INFO", "Visitor checked in"));

		System.out.println("All alerts: ");
		alerts.forEach(alert -> System.out.println("  " + alert));

		Predicate<Alert> isCritical = alert -> alert.getType().equals("CRITICAL");

		System.out.println("\nCritical alerts: ");
		alerts.stream().filter(isCritical).forEach(alert -> System.out.println("  " + alert));

		Predicate<Alert> noInfo = alert -> !alert.getType().equals("INFO");
		System.out.println("\nNon-info alerts: ");
		alerts.stream().filter(noInfo).forEach(alert -> System.out.println("  " + alert));
	}
}
