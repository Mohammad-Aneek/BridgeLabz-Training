import java.util.Scanner;

public class LeapYearCompact {
    public static void main(String[] args) {
        // Create a scanner object
        Scanner input = new Scanner(System.in);

        // get the current year as input
        int currentYear = input.nextInt();

        // check the year
        if (currentYear < 1582) {
            System.out.println("Invalid year");
            input.close();
            return;
        }

        //check if Leap Year or not
        if (currentYear % 400 == 0 || (currentYear % 4 ==0 && currentYear % 100 != 0)){
            System.out.println(currentYear +" is a leap year");
        } else {
            System.out.println(currentYear + " is not a leap year");
        }

        // close the Scanner
        input.close();
    }
}
