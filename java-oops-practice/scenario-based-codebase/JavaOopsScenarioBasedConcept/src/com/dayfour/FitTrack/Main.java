package com.dayfour.FitTrack;

import java.time.Duration;

public class Main {

	public static void main(String[] args) {
        UserProfile user = new UserProfile("Aneek", 21, 85, 500);

        Workout morningRun = new CardioWorkout(Duration.ofMinutes(30));
        Workout eveningGym = new StrengthWorkout(Duration.ofMinutes(60));
        
        user.doWorkout(morningRun);
        user.doWorkout(eveningGym);

        user.display();
	}

}
