/* 16. Digital Watch Simulation ⏱️
 * Simulate a 24-hour watch:
 * ● Print hours and minutes in a nested for-loop.
 * ● Use a break to stop at 13:00 manually (simulate power cut).
 * Core Java Scenario Based Problem Statements
 */

import java.time.*;
import java.time.format.DateTimeFormatter;

public class DigitalWatch {
    public static void main(String[] args) throws Exception{
        // powercut time
        LocalTime threshold = LocalTime.of(13,0);

        // time formatter
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");

        // current time
        LocalTime time = LocalTime.parse(LocalTime.now().format(formatter),formatter);

        System.out.println("Digital watch simlution");
        // clock Simulation
        while (time.isBefore(threshold)) {
            System.out.println(time.format(formatter));

            // increment by 1 minute
            time = time.plusMinutes(1);

            Thread.sleep(1000);
        }

        System.out.println("Powercut");
    }
}
