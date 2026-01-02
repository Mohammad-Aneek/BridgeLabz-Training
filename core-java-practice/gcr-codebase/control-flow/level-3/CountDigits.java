import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        // Create a scanner object
        Scanner input = new Scanner(System.in);

        // get a number as input
        int number = input.nextInt();

        //check for positive
        if (number < 0) {
            System.out.println("Invalid number");
            input.close();
            return;
        }

        // check for number of digits
        int counter = 0;
        int temporaryNumber = number;

        // loop continues while there is atleast 1 digit
        while (temporaryNumber > 0) {
            // increase counter to depict 1 digit
            counter++;

            // removing last digit from the number
            temporaryNumber/=10;
        }

        // display the results
        System.out.println("There are "+counter+" digits in "+number);
        // close the Scanner
        input.close();
    }
}
