import java.util.Scanner;

public class FactorialUsingWhile {
    public static void main(String[] args) {
        // creating a Scanner object
        Scanner input = new Scanner(System.in);

        // number to find factorial of
        int number = input.nextInt();

        // check the number
        if (number < 0) {
            System.out.println("Invalid number");
            return;
        }

        // calculate the factorial
        int counter = 2;
        int factorial = 1;

        while (counter<=number) {
            factorial*=counter;
            counter++;
        }

        // display the result
        System.out.println("The factorial of " + number + " is " + factorial);

        // closing the Scanner
        input.close();
    }
}
