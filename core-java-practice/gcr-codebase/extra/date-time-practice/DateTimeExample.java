import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DateTimeExample {
    // to get the date as input
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

    // returns the day of week
    public String getDayOfWeek(LocalDate date) {
        return date.getDayOfWeek().toString();
    }

    // to get the difference between a date and current date
    public long getDaysBetween(LocalDate date) {
        // to get the current date 
        LocalDate currentdate = LocalDate.now();

        // to calculate number of days between two dates
        long daysBetween = ChronoUnit.DAYS.between(date, currentdate);

        return daysBetween;
    }


    // to get the current date and time as a formatted string
    public String getCurrentDateTime() {
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        return dateTime.format(formatter);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DateTimeExample object = new DateTimeExample();

        LocalDate date = object.getDateInput(input);
        System.out.println(object.getDayOfWeek(date));
        System.out.println(object.getDaysBetween(date));
        System.out.println(object.getCurrentDateTime());

        input.close();
    }
}
