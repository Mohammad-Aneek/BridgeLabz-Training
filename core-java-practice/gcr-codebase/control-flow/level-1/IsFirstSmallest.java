import java.util.Scanner;

// to check if the first number among three is smallest or not
public class IsFirstSmallest {
    public static void main(String[] args) {
        // Creating a Scanner object
        Scanner input = new Scanner(System.in);

        // taking three numbers as input
        System.out.print("Enter the three numbers: ");
        int firstNumber = input.nextInt(), secondNumber = input.nextInt(), thirdNumber = input.nextInt();

        // check if the first number is the smallest
        System.out.print("Is the first number the smallest? ");
        if(firstNumber < secondNumber && firstNumber < thirdNumber) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        // closing the Scanner
        input.close();
    }
}
