import java.util.Scanner;

// Take a 2 Dimesional array and convert it to a single dimesional array
public class MultiDimensionalArray {
    public static void main(String[] args) {
        // create a Scanner object
        Scanner input = new Scanner(System.in);

        int rows = input.nextInt(), columns = input.nextInt();
        int [][]matrix = new int[rows][columns];

        for (int outerCounter = 0; outerCounter < rows; outerCounter++) {
            for (int innerCounter = 0; innerCounter < columns; innerCounter++) {
                matrix[outerCounter][innerCounter] = input.nextInt();
            }
        }

        int []array = new int[rows*columns];
        int counterForArray = 0;

        for (int outerCounter = 0; outerCounter < rows; outerCounter++) {
            for (int innerCounter = 0; innerCounter < columns; innerCounter++) {
                array[counterForArray] = matrix[outerCounter][innerCounter];
                counterForArray++;
            }
        }

        for (int element : array) {
            System.out.print(element +" ");
        }
        System.out.println();
    }
}
