import java.util.Scanner;

// largest and second largest digits
public class Digits {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        if (number <= 1) {
            System.out.println("Invalid number");
            input.close();
            return;
        }

        int maxDigit = 10;
        int []digits = new int[maxDigit];
        int index = 0;

        while (number > 0 && index < maxDigit) {
            int digit = number % 10;

            digits[index] = digit;

            number /= 10;
            index++;
        }

        int firstLargest = -1, secondLargest = -1;

        for (int digit : digits) {
            if (digit > firstLargest){
                secondLargest = firstLargest;
                firstLargest = digit;
            } else if (digit > secondLargest && digit != firstLargest) {
                secondLargest = digit;
            }
        }

        if (firstLargest != -1) {
            System.out.println(firstLargest + " is the largest digit");
        }

        if (secondLargest != -1) {
            System.out.println(secondLargest + " is the second largest digit");
        }
    }
}
