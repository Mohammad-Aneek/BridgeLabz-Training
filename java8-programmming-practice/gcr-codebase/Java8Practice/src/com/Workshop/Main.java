package com.Workshop;

public class Main {
    public static void main(String[] args) {
	TransportManager city = new TransportManager();

	FareCalculator standardFare = (dist, rate) -> dist * rate;
	double calculated = standardFare.calculateFare(10.5, 2.0);

	city.addService(new BusService("Route 42", 2.50, "09:00"));
	city.addService(new BusService("Express 9", 5.00, "08:30"));
	city.addService(new AmbulanceService());

	city.displayDashboard();

	city.generateRevenueReport();

	city.getQuickestCheapest("2400").stream().filter(s -> s instanceof EmergencyService)
		.forEach(s -> System.out.println("PRIORITY: " + s.getName()));
    }
}
