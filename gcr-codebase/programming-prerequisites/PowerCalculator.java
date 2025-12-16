import java.util.Scanner;

public class PowerCalculator {
    static long pow(int base, int exponent) {
        if (exponent%2 == 0) {
            int temp = pow(base, exponent/2);
            return temp * temp;
        } else {
            int temp = pow(base, exponent/2);
            return temp * temp * base;
        }
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the base: ");
            int base = sc.nextInt();

            System.out.print("Enter the exponent: ");
            int exponent = sc.nextInt();

            long answer = pow(base, exponent);
            System.out.println("The answer");
        }
    }
}
