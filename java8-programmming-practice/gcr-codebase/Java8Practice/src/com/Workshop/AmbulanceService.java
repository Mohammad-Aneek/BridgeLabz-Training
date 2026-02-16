package com.Workshop;

import java.time.LocalTime;

public class AmbulanceService implements TransportService, EmergencyService {

    @Override
    public String getName() {
	// TODO Auto-generated method stub
	return "City Med-1";
    }

    @Override
    public String getType() {
	// TODO Auto-generated method stub
	return "Ambulance";
    }

    @Override
    public double getFare() {
	// TODO Auto-generated method stub
	return 0;
    }

    @Override
    public LocalTime getDepartureTime() {
	// TODO Auto-generated method stub
	return null;
    }

}
