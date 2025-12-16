import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter the first number :");
            int num1 = sc.nextInt();

            System.out.print("Enter the second number :");
            int num2 = sc.nextInt();

            System.out.println("The sum is :" + (num1 + num2));
        }
    }
}
