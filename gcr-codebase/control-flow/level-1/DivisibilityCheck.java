import java.util.Scanner;

// to check if a number is divisible by 5
public class DivisibilityCheck {
    public static void main(String[] args) {
        // Creating a Scanner object
        Scanner input = new Scanner(System.in);

        // take the number to be checked as input
        System.out.print("Enter a number: ");
        int number = input.nextInt();


        // check the divisibility against 5
        System.out.print("Is the number "+number+" divisible by 5? ");
        if (number%5 == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }


        // closing the Scanner
        input.close();
    }
}
