import java.util.Scanner;

public class FactorsUsingFor {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Input number
        int number = input.nextInt();

        // check for positive
        if (number < 1) {
            System.out.println("number not positive");
            input.close();
            return;
        }

        for (int counter = 1; counter < number; counter++) {
            if (number % counter == 0) {
                System.out.println(number + " is divisible by " + counter);
            }
        }
        // close the Scanner
        input.close();
    }
}
