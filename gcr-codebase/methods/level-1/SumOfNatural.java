import java.util.Scanner;

// to calculate sum of natural numbers
public class SumOfNatural {

    // to calculate sum for each number in range from 1 to the given number
    int getSumUpto(int number) {
        int sum = 0;

        for (int counter = 1; counter <= number; counter++) {
            sum+=counter;
        }

        return sum;
    }

    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);
        SumOfNatural object = new SumOfNatural();

        int number = input.nextInt();

        if (number <= 0) {
            System.out.println("Invalid number");
            input.close();
            return;
        }

        // use method to get sum
        int sum = object.getSumUpto(number);

        // display the data 
        System.out.println("The sum of numbers from 1 to " + number + " is "+sum);

        // close the Scanner
        input.close();
    }
}
