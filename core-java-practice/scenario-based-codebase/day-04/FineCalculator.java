import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class FineCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        int []fine = new int[5];
        int totalFine = 0;
        int size = 0;

        try {
            for (int i = 0; i < 5; i++) {
                System.out.print("Enter the due date(dd-MM-yyyy): ");
                LocalDate dueDate = LocalDate.parse(input.next(),format);
            
                System.out.print("Enter the return date(dd-MM-yyyy): ");
                LocalDate returnDate = LocalDate.parse(input.next(),format);

                if (returnDate.isAfter(dueDate)) {
                    fine[i] = (int)ChronoUnit.DAYS.between(dueDate, returnDate) * 5;
                    totalFine += fine[i];
                } 
                size++;
            }
        } catch (Exception e) {
            System.out.println("Wrong format");
        }

        for (int i=0; i < size;  i++) {
            System.out.println("The fine for book " + (i+1) + " is " + fine[i]);
        }
        System.out.println("The total fine is " + totalFine);
        
    }
}
