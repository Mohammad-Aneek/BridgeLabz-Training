import java.util.Scanner;

public class CheckNumber {
    public static void main(String[] args) {
        // creating a Scanner object
        Scanner input = new Scanner(System.in);

        // number to be checked
        int number = input.nextInt();

        // check the number
        if (number < 0) {
            System.out.println("negative");
        } else if(number > 0) {
            System.out.println("positive");
        } else {
            System.out.println("zero");
        }

        // closing the Scanner
        input.close();
    }
}
