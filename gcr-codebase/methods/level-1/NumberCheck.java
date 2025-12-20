import java.util.Scanner;

// to check number for postive, negative, or zero
public class NumberCheck {
    // method that checks the number
    byte checkNumber(int number) {
        if (number < 0) {
            return -1;
        } else if (number > 0) {
            return 1;
        } else {
            return 0;
        }
    }
    public static void main(String[] args) {
        // Create a Scanner object and NumberCheck object
        Scanner input = new Scanner(System.in);
        NumberCheck object = new NumberCheck();

        int number = input.nextInt();
        int result = object.checkNumber(number);

        // diplay the result
        if (result == -1) {
            System.out.println("Number is negative");
        } else if (result == 1) {
            System.out.println("Number is postive");
        } else {
            System.out.println("Number is zero");
        }

        // close the Scanner
        input.close();
    }
}
