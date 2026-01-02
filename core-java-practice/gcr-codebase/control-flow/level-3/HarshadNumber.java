import java.util.Scanner;

public class HarshadNumber {
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

        // check for HarshadNumber
        int sumOfDigits = 0;
        int temporaryNumber = number;

        // loop continues while there is atleast 1 digit
        while (temporaryNumber > 0) {
            // geting the last digit from Number
            int lastDigit = temporaryNumber%10;

            // add the digit to the sum 
            sumOfDigits += lastDigit;

            // removing last digit from the number
            temporaryNumber/=10;
        }

        // display the results
        if (number%sumOfDigits == 0) {
            System.out.println(number + " is Harshad Number");
        } else {
            System.out.println(number + " is not Harshad Number");
        }

        // close the Scanner
        input.close();
    }
}
