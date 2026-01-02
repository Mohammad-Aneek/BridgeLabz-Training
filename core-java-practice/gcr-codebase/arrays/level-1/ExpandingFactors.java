import java.util.Scanner;

// to find factors of a number and store it in array and everytime the array is filled double the size
public class ExpandingFactors {
    // method to expand array
    static int[] expandArray(int []array) {
        int newSize = array.length * 2;
        int[] expandedArray = new int[newSize];
        
        for (int index = 0; index < array.length; index++) {
            expandedArray[index] = array[index];
        }

        return expandedArray;
    }

    public static void main(String[] args) {
        // Creating a Scanner object
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        int[] factors = new int[10];
        int indexForFactors = 0;

        for (int counter = 1; counter < number; counter++) {
            if (number % counter == 0) {
                factors[indexForFactors] = counter;
                indexForFactors++;
            }

            if (indexForFactors == factors.length) {
                factors = expandArray(factors);
            }
        }

        for (int counter = 0; counter < indexForFactors; counter++) {
            System.out.print(factors[counter]+ " ");
        }
        System.out.println();
    }
}
