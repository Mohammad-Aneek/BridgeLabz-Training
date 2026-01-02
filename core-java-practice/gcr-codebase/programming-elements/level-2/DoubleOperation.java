import java.util.Scanner;

// take 3 numbers as input and perform various operations on them
public class DoubleOperation {
    public static void main(String[] args) {
        // Creating a Scanner object
        Scanner input = new Scanner(System.in);

        // taking the three numbers as input
        System.out.println("Enter a, b, and c: ");
        double a = input.nextDouble(), b=input.nextDouble(), c=input.nextDouble();

        // calculate and store the result of operations
        double result1 = a + b * c;
        double result2 = a * b + c;
        double result3 = c + a / b;
        double result4 = a % b + c;

        // display the results
        System.out.printf("The results of double Operations are %f, %f, %f, and %f",result1,result2,result3,result4);

        // closing the Scanner object
        input.close();

    }
}
