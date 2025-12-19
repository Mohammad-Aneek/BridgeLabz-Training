import java.util.Scanner;

public class DayOfWeek {
    // to check if any year is leap or not
    static boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 4 == 0 && year % 100 != 0) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        // Creating a Scanner object
        Scanner input = new Scanner(System.in);

        // converting commandline inputs to Integer types
        int month = Integer.parseInt(args[0]), days = Integer.parseInt(args[1]), year = Integer.parseInt(args[2]);

        // calculation the day using formulas
        int totalDays = 0;


        // we get 1 extra day every year but 2 extra on leap years
        totalDays+= (year - 1) + year/4 - year/100 + year/400;

        // extra days per month for a normal year
        int arr[] = {3,0,3,2,3,2,3,3,2,3,2,3};

        // adding extra day per each fully completed month
        for (int i = 1;i<month; i++) {
            totalDays += arr[i-1];
        }


        // adding the extra days for the current mont and any leap day if leap years
        if (isLeapYear(year) && (month > 2 || (month == 2 && days == 29))) {
            totalDays += 1;
        }
        totalDays+=days;

        // fing the day on the date 
        int dayOfWeek = totalDays % 7;

        switch (dayOfWeek) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                break;
        }
    }
}
