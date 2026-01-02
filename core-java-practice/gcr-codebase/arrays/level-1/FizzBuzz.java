import java.util.Scanner;

// implemenattion of the fizz buzz problem statement
public class FizzBuzz {
    public static void main(String[] args) {
        // Creating a Scanner object
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        String[] array = new String[number];

        for (int counter = 1; counter <= number; counter++) {
            if (counter % 3 == 0 && counter % 5 == 0) {
                array[counter-1] = "FizzBuzz";
            } else if (counter % 3 == 0) {
                array[counter-1] = "Fizz";
            } else if (counter % 5 == 0) {
                array[counter-1] = "Buzz";
            } else {
                array[counter-1] = ""+counter;
            }
        }

        for (String str : array) {
            System.out.print(str+" ");
        }
        System.out.println();
    }
}
