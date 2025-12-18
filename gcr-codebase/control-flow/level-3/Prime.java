import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        // Create a scanner object
        Scanner input = new Scanner(System.in);

        // get a number as input
        int number = input.nextInt();

        //checl for valid prime
        if (number <= 1) {
            System.out.println("Invalid number");
            input.close();
            return;
        }

        // check for prime
        boolean isPrime = true;
        for (int counter = 2; counter < number; counter++) {
            if (number % counter == 0) {
                isPrime = false;
            }
        }

        // display the results
        if (isPrime) {
            System.out.println(number + " is prime");
        } else {
            System.out.println(number + " is not prime");
        }

        // close the Scanner
        input.close();
    }
}
