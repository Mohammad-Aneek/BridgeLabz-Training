import java.util.Scanner;

public class FizzBuzzUsingFor {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Input a number
        int number = input.nextInt();

        // check for positive integer
        if (number < 1) {
            System.out.println("Number not positive");
            input.close();
            return;
        }

        // display the result 
        for (int counter = 1; counter <= number; counter++) {
            if (counter % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if (counter % 5 == 0 ) {
                System.out.println("Buzz");
            } else if (counter % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(counter);
            }
        }
        // close the Scanner
        input.close();
    }
}
