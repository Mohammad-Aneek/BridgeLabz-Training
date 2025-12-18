import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        // Create a scanner object
        Scanner input = new Scanner(System.in);

        // get a number as input
        int number = input.nextInt();

        //check for valid number
        if (number < 0) {
            System.out.println("Invalid number");
            input.close();
            return;
        }

        // check for Armstrong
        int sum = 0;
        int temporaryNumber = number;

        // loop continues while there is atleast 1 digit
        while (temporaryNumber > 0) {
            // geting the last digit from Number
            int lastDigit = temporaryNumber%10;

            // find the cube of the last digit 
            int cubeOfDigit = lastDigit * lastDigit * lastDigit;

            // add the cube of digit to the sum 
            sum += cubeOfDigit;

            // removing last digit from the number
            temporaryNumber/=10;
        }

        // display the results
        if (sum == number) {
            System.out.println(number + " is Armstrong");
        } else {
            System.out.println(number + " is not Armstrong");
        }

        // close the Scanner
        input.close();
    }
}
