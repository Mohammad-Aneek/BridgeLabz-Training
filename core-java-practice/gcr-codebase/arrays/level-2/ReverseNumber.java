import java.util.Scanner;

// largest and second largest digits
public class ReverseNumber {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        if (number <= 1) {
            System.out.println("Invalid number");
            input.close();
            return;
        }

        final int originalNumber = number;
        int digitCount = 0;

        while (number > 0) {
            digitCount++;
            number/=10;
        }

        int []digits = new int[digitCount];
        int index = 0;

        number = originalNumber;
        while (number > 0) {
            int digit = number%10;

            digits[index] = digit;

            number/=10;
            index++;
        }

        for (int digit: digits) {
            index--;
            System.out.print(digit);
        }

        System.out.println();

        // Close the Scanner
        input.close();
    }
}
