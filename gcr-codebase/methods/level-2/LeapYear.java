import java.util.Scanner;

public class LeapYear {
    // to check if any year is a leap year or not
    public static boolean isLeapYear(int currentYear) {
        if (currentYear % 400 == 0) {
            return true;
        } else if (currentYear % 4 ==0 && currentYear % 100 != 0){
            return true;
        } else {
            return false;
        }
    } 

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
        if (isLeapYear(currentYear)) {
            System.out.println(currentYear + " is a leap year");
        } else {
            System.out.println(currentYear + " is not a leap year");
        }

        // close the Scanner
        input.close();
    }
}
