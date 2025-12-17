import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // Creating the Scanner object
        Scanner input = new Scanner(System.in);

        // getting the numbers as input
        System.out.print("Enter two space separated numbers: ");
        int number1 = input.nextInt(), number2 = input.nextInt();

        // calculate and store for all 4 operation +, -, *, and / 
        int sum = number1 + number2;
        int difference = number1 - number2;
        int product = number1 * number2;
        int division = number1 / number2;

        // display data 
        System.out.printf("The addition, subtraction, multiplication, and division value of 2 numbers %d and %d is %d, %d, %d, and %d", number1,number2,sum,difference,product,division);
    }
}
