import java.util.Scanner;

public class SumUntilZeroWithFor {
    public static void main(String[] args) {
        // Creating a Scanner object
        Scanner input = new Scanner(System.in);

        // Initialize variables for input and Sum
        double total = 0;

        // start countdown
        for (double number = 1; number != 0;) {
            number = input.nextDouble();

            total+=number;
        }

        System.out.println("The sum is "+ total);

        // closing the scanner object
        input.close();
    }
}
