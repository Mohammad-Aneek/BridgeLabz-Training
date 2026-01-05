package com.daytwo.CabbyGo;

public interface IRideService {
	void bookRide(String pickup, String destination);

	void endRide(double distance);
}
