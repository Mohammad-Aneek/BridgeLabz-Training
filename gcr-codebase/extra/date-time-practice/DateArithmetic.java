import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateArithmetic {
    // to get the current date of any zone and time as a formatted string
    public String getCurrentDateTime(String zone) {
        ZonedDateTime dateTime = ZonedDateTime.now(ZoneId.of(zone));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        return dateTime.format(formatter);
    }

    public LocalDate getDateInput(Scanner input) {
        System.out.print("Enter a date (dd-MM-yyyy): ");
        String inputDate = input.nextLine();
        
        // create a DateTimeFormatter class object which defines a pattern for the date & time
        // this can be used to covert date objec to readable stringa and vice versa 
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        
        // to store the date
        LocalDate date = LocalDate.parse(inputDate,formatter);

        return date;
    }

    public String getDate(LocalDate date) {        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return date.format(formatter);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DateArithmetic object = new DateArithmetic();

        LocalDate date = object.getDateInput(input);
        System.out.println("current date : " + object.getDate(date));
        date = date.plusDays(7).plusMonths(1).plusYears(2);
        System.out.println("After 2 years, 1 month, and 7 days : " + object.getDate(date));
        date = date.minusWeeks(3);
        System.out.println("coming back 3 weeks : " + object.getDate(date));
    }
}
