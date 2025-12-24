import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DateFormatting {
    // to get the current date and time as a formatted string
    public String getCurrentDateTime(String format) {
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
        return dateTime.format(formatter);
    }

    public static void main(String[] args) {
        DateFormatting object = new DateFormatting();

        System.out.println(object.getCurrentDateTime("dd/MM/yyyy"));
        System.out.println(object.getCurrentDateTime("yyyy-MM-dd"));
        System.out.println(object.getCurrentDateTime("EEE, MMM dd, yyyy"));

    }
}
