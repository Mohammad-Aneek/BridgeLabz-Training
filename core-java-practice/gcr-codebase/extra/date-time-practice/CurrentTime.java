import java.time.*;
import java.time.format.DateTimeFormatter;

public class CurrentTime {
    // to get the current date of any zone and time as a formatted string
    public String getCurrentDateTime(String zone) {
        ZonedDateTime dateTime = ZonedDateTime.now(ZoneId.of(zone));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        return dateTime.format(formatter);
    }

    public static void main(String[] args) {
        CurrentTime object = new CurrentTime();
        System.out.println("GMT : " + object.getCurrentDateTime("GMT"));
        System.out.println("IST : " + object.getCurrentDateTime("Asia/Kolkata"));
        System.out.println("PST : " + object.getCurrentDateTime("America/Los_Angeles"));
    }
}
