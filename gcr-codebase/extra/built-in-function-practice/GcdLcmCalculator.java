import java.util.Scanner;

public class GcdLcmCalculator {
    // takes two numbers as input
    public static int[] takeInput() {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[2];
        
        System.out.print("Enter first number: ");
        numbers[0] = input.nextInt();
        
        System.out.print("Enter second number: ");
        numbers[1] = input.nextInt();
        
        input.close();
        return numbers;
    }

    // calculates the GCD using Euclidean algorithm
    public static int calculateGcd(int a, int b) {
        // make sure both numbers are positive
        a = Math.abs(a);
        b = Math.abs(b);

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }

    // calculates the LCM using the formula: LCM(a,b) = (a * b) / GCD(a,b)
    public static int calculateLcm(int a, int b) {
        return Math.abs(a * b) / calculateGcd(a, b);
    }

    public static void main(String[] args) {
        int[] numbers = takeInput();
        int num1 = numbers[0];
        int num2 = numbers[1];

        int gcd = calculateGcd(num1, num2);
        int lcm = calculateLcm(num1, num2);

        System.out.println("GCD of " + num1 + " and " + num2 + " = " + gcd);
        System.out.println("LCM of " + num1 + " and " + num2 + " = " + lcm);
    }
}
