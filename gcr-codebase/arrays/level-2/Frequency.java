import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) {
        // create a Scanner object
        Scanner input = new Scanner(System.in);

        final int originalNumber = input.nextInt();
        int number = originalNumber;
        int[] frequencyArray = new int[10];

        int countOfDigits = 0;
        while (number > 0) {
            countOfDigits++;
            number/=10;
        }

        int[] digits = new int[countOfDigits];
        int index = 0;
        number = originalNumber;

        while (index < countOfDigits) {
            int digit = number % 10;
            digits[index] = digit;

            index++;
            number/=10;
        }

        for (int digit : digits) {
            frequencyArray[digit]++;
        }

        for (int counter = 0; counter < 10; counter++) {
            System.out.println("The frequency of "+counter + " is "+frequencyArray[counter]);
        }
    }
}
