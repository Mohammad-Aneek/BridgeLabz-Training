import java.util.Scanner;

public class FactorsUsingWhile {
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

        int counter = 1;
        while (counter < number) {
            if (number % counter == 0) {
                System.out.println(number + " is divisible by " + counter);
            }
            counter++;
        }
        // close the Scanner
        input.close();
    }
}
