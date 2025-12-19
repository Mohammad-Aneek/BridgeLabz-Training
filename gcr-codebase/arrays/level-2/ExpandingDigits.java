import java.util.Scanner;

// largest and second largest digits
public class ExpandingDigits {
    static int[] expandArray(int []array){
        int []expandedArray = new int[array.length + 10];

        for (int index = 0; index < array.length; index++) {
            expandedArray[index] = array[index];
        }

        return expandedArray;
    }

    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        if (number <= 1) {
            System.out.println("Invalid number");
            input.close();
            return;
        }

        int maxDigits = 10;
        int []digits = new int[maxDigits];
        int index = 0;

        while (number > 0) {
            int digit = number % 10;

            digits[index] = digit;

            number /= 10;
            index++;

            if (index == maxDigits) {
                digits = expandArray(digits);
                maxDigits+=10;
            }
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

        // close the Scanner
        input.close();
    }
}
