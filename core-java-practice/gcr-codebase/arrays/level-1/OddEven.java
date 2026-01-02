import java.util.Scanner;

// take a number and then in the range 1 to number store even and odd in different arrays
public class OddEven {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        int[] even = new int[number/2], odd = new int[(number+1)/2];
        int indexForEven = 0, indexForOdd = 0;

        for (int counter = 1; counter <= number; counter++) {
            if (counter%2==0) {
                even[indexForEven] = counter;
                indexForEven++;
            } else {
                odd[indexForOdd] = counter;
                indexForOdd++;
            }
        }

        System.out.println("Even numbers: ");
        for (int evenNumbers : even) {
            System.out.print(evenNumbers+", ");
        }

        System.out.println("\nOdd numbers: ");
        for (int oddNumbers : odd) {
            System.out.print(oddNumbers+", ");
        }
    }
}
