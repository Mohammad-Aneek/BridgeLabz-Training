import java.util.Scanner;

public class BasicCalculator {
    // takes two numbers and operator as input
    public static double[] takeInput() {
        Scanner input = new Scanner(System.in);
        double[] data = new double[2];
        
        System.out.print("Enter first number: ");
        data[0] = input.nextDouble();
        
        System.out.print("Enter second number: ");
        data[1] = input.nextDouble();
        
        input.close();
        return data;
    }

    // gets the operator choice from user
    public static char getOperator() {
        Scanner input = new Scanner(System.in);
        
        System.out.println("\nSelect an operation:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.print("Enter your choice (1-4): ");
        
        int choice = input.nextInt();
        input.close();

        switch (choice) {
            case 1:
                return '+';
            case 2:
                return '-';
            case 3:
                return '*';
            case 4:
                return '/';
            default:
                return '?';
        }
    }

    // performs addition
    public static double add(double a, double b) {
        return a + b;
    }

    // performs subtraction
    public static double subtract(double a, double b) {
        return a - b;
    }

    // performs multiplication
    public static double multiply(double a, double b) {
        return a * b;
    }

    // performs division
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero");
            return Double.NaN;
        }
        return a / b;
    }

    public static void main(String[] args) {
        double[] numbers = takeInput();
        double num1 = numbers[0];
        double num2 = numbers[1];
        
        char operator = getOperator();
        double result = 0;

        switch (operator) {
            case '+':
                result = add(num1, num2);
                System.out.println(num1 + " + " + num2 + " = " + result);
                break;
            case '-':
                result = subtract(num1, num2);
                System.out.println(num1 + " - " + num2 + " = " + result);
                break;
            case '*':
                result = multiply(num1, num2);
                System.out.println(num1 + " * " + num2 + " = " + result);
                break;
            case '/':
                result = divide(num1, num2);
                if (!Double.isNaN(result)) {
                    System.out.println(num1 + " / " + num2 + " = " + result);
                }
                break;
            default:
                System.out.println("Invalid operator");
        }
    }
}
