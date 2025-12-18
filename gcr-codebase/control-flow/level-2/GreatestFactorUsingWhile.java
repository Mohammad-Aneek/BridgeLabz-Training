import java.util.Scanner;

public class GreatestFactorUsingWhile {
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

        int counter = number -1;
        while (counter > 0) {
            if (number % counter == 0) {
                System.out.println("Greatest factor of "+number+ " is "+counter);
                break;
            }
            counter--;
        }
        // close the Scanner
        input.close();
    }
}
