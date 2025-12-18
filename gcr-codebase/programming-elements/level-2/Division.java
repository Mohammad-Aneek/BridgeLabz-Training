import java.util.Scanner;

// Take two numbers as input and display their quotient and remainder
public class Division {
    public static void main(String[] args) {
        // Creating Scanner object
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the divisor: ");
        int divisor = input.nextInt();

        System.out.println("Enter the dividend: ");
        int dividend = input.nextInt();

        // calculate and store the quotient and remainder
        int quotient = dividend/divisor;
        int remainder = dividend%divisor;

        System.out.println("The Quotient is "+quotient+" and Reminder is "+remainder+" of two number "+ divisor + " and "+dividend);

        input.close();
    }
}
