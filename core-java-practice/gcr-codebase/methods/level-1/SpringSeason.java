import java.util.Scanner;

public class SpringSeason {
    // to check if a day of year is in spring or not
    boolean isSpring(String month, int day) {
        switch (month) {
            case "March":
                if (day>=20) {
                    return true;
                }
                break;
            case "April":
            case "May":
                return true;
            case "June":
                if (day <=20) {
                    return true;
                }
        }
        return false;
    }

    public static void main(String[] args) {
        // Creating a Scanner object
        Scanner input = new Scanner(System.in);
        SpringSeason object = new SpringSeason();

        // Month and day
        String month = input.next();
        int day = input.nextInt();

        // flag varibales
        boolean flag = object.isSpring(month, day);

        // displaying the result
        if (flag) {
            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }

        // closing the scanner object
        input.close();
    }
}
