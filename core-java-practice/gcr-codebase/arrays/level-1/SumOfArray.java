import java.util.Scanner;

// to calculate the sum of array
public class SumOfArray {
    public static void main(String[] args) {
        // Create the Scanner Object
        Scanner input = new Scanner(System.in);

        // array of length 10
        double []array = new double[10];
        double sum = 0;
        int index = 0;

        while (true) {
            double number = input.nextDouble();

            if(number <= 0) {
                break;
            }

            array[index] = number;

            index++;

            if (index == array.length) {
                break;
            }
        }

        for (int counter = 0; counter < index; counter++) {
            sum += array[counter];
        }

        System.out.println("The total is "+sum);

        // closing the Scanner
        input.close();
    }
}
