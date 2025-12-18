import java.util.Scanner;

public class GreatestFactorUsingFor {
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

        for (int counter = number - 1; counter > 0; counter--) {
            if (number % counter == 0) {
                System.out.println("Greatest factor of "+number+ " is "+counter);
                break;
            }
        }
        // close the Scanner
        input.close();
    }
}
