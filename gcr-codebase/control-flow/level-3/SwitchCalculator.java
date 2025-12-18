import java.util.Scanner;

public class SwitchCalculator {
    public static void main(String[] args) {
        // Create a scanner object
        Scanner input = new Scanner(System.in);

        // getting the two numbers and operator as input
        double firstNumber = input.nextDouble();
        String operator = input.next();
        double secondNumber = input.nextDouble();
        double result = 0;
        switch (operator.charAt(0)) {
            case '+':
                result = firstNumber + secondNumber;
                break;
            case '-':
                result = firstNumber - secondNumber;
                break;
            case '*':
                result = firstNumber * secondNumber;
                break;
            case '/':
                result = firstNumber / secondNumber;
                break;
            default:
                System.out.println("Invalid operator");
                return;
        }

        System.out.println(firstNumber+" "+operator+" "+secondNumber+" = "+result);

        // close the Scanner
        input.close();
    }
}
