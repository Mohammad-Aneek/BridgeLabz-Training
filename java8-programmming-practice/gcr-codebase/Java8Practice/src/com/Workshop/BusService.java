package com.Workshop;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class BusService implements TransportService {
    private String name;
    private double fare;
    private LocalTime time;

    public BusService(String name, double fare, String time) {
	this.name = name;
	this.fare = fare;
	this.time = LocalTime.parse(time, DateTimeFormatter.ofPattern("HH:mm"));
    }

    @Override
    public String getName() {
	// TODO Auto-generated method stub
	return name;
    }

    @Override
    public String getType() {
	// TODO Auto-generated method stub
	return "Bus";
    }

    @Override
    public double getFare() {
	// TODO Auto-generated method stub
	return fare;
    }

    @Override
    public LocalTime getDepartureTime() {
	// TODO Auto-generated method stub
	return time;
    }

}
