import java.util.Scanner;

public class AverageCalculator {
    static double getAverage(double num1, double num2, double num3) {
        double sum = num1 + num2 + num3;
        double average = sum/3;

        return average;
    }

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the first number: ");
            double num1 = sc.nextInt();

            System.out.println("Enter the second number: ");
            double num2 = sc.nextInt();

            System.out.println("Enter the third number: ");
            double num3 = sc.nextInt();

            double average = getAverage(num1,num2,num3);
            System.out.println("The average of the numbers is " + average);

        }
    }
}
