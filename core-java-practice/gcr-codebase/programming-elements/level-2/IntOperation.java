import java.util.Scanner;

// take 3 numbers as input and perform various operations on them
public class IntOperation {
    public static void main(String[] args) {
        // Creating a Scanner object
        Scanner input = new Scanner(System.in);

        // taking the three numbers as input
        System.out.println("Enter a, b, and c: ");
        int a = input.nextInt(), b=input.nextInt(), c=input.nextInt();

        // calculate and store the result of operations
        int result1 = a + b * c;
        int result2 = a * b + c;
        int result3 = c + a / b;
        int result4 = a % b + c;

        // display the results
        System.out.printf("The results of Int Operations are %d, %d, %d, and %d",result1,result2,result3,result4);

        // closing the Scanner object
        input.close();

    }
}
