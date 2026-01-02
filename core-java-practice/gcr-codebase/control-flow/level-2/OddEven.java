import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Input a number 
        int number = input.nextInt();

        // check for natural number
        if (number < 1) {
            System.out.println("Not a natural number");
            input.close();
            return;
        }

        //checking each number for even or odd 
        for (int counter = 1; counter <= number; counter++) {
            if(counter%2==0) {
                System.out.println(counter + " is even");
            } else {
                System.out.println(counter + " is odd");
            }
        }

        // close the Scanner
        input.close();
    }
}
