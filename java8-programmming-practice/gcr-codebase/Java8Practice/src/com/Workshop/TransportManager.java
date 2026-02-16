package com.Workshop;

import java.time.LocalTime;
import java.util.*;
import java.util.stream.Collectors;

public class TransportManager {
    private List<TransportService> services = new ArrayList<>();

    public void addService(TransportService s) {
	services.add(s);
    }

    public List<TransportService> getQuickestCheapest(String maxTime) {
	LocalTime max = LocalTime.parse(maxTime);
	return services.stream().filter(s -> max.isAfter(s.getDepartureTime()) || max.equals(s.getDepartureTime()))
		.sorted(Comparator.comparingDouble(TransportService::getFare)).collect(Collectors.toList());
    }

    public void generateRevenueReport() {
	DoubleSummaryStatistics stats = services.stream()
		.collect(Collectors.summarizingDouble(TransportService::getFare));

	System.out.println("Total Revenue: $" + stats.getSum());
	System.out.println("Avg Fare: $" + stats.getAverage());

	Map<String, List<TransportService>> grouped = services.stream()
		.collect(Collectors.groupingBy(TransportService::getType));

	Map<Boolean, List<TransportService>> peakStatus = services.stream()
		.collect(Collectors.partitioningBy(s -> s.getDepartureTime().isAfter(LocalTime.of(8, 0))
			&& s.getDepartureTime().isBefore(LocalTime.of(10, 0))));
    }

    public void displayDashboard() {
	System.out.println("\n--- LIVE DASHBOARD ---");
	services.forEach(TransportService::printServiceDetails);
    }
}
