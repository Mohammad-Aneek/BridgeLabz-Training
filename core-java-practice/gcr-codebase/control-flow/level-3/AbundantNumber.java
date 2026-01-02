import java.util.Scanner;

public class AbundantNumber {
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

        // check for Abundant Number
        int sumOfDivisors = 0;

        // loop finds all factors of the number
        for (int counter = 1; counter < number; counter++) {
            if (number%counter==0) {
                sumOfDivisors += counter;
            }
        }

        // display the results
        if (sumOfDivisors > number) {
            System.out.println(number + " is Abundant Number");
        } else {
            System.out.println(number + " is not Abundant Number");
        }

        // close the Scanner
        input.close();
    }
}
