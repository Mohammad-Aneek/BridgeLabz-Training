import java.util.Scanner;

public class FizzBuzzUsingWhile {
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
        int counter = 1;
        while (counter <= number) {
            if (counter % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if (counter % 5 == 0 ) {
                System.out.println("Buzz");
            } else if (counter % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(counter);
            }

            counter++;
        }
        // close the Scanner
        input.close();
    }
}
