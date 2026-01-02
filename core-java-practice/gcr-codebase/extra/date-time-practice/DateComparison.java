import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DateComparison {
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

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DateComparison object = new DateComparison();

        LocalDate date1 = object.getDateInput(input);
        LocalDate date2 = object.getDateInput(input);

        System.out.println("isBefore: " + date1.isBefore(date2));
        System.out.println("isAfter: " + date1.isAfter(date2));
        System.out.println("isEqual: " + date1.isEqual(date2));

        input.close();
    }
}
