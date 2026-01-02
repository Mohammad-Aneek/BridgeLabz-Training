import java.util.Scanner;

public class SumOfNatural {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // taking a number n as input
        int n = input.nextInt();

        // check if the number n is natural or not
        if(n < 1){
            System.out.println("The number "+n+" is not a natural number");
            input.close();
            return;
        }

        // calculate sum of n natural number
        int sumOfNatural = n * (n + 1) / 2;
        System.out.println("The sum of "+n+" natural numbers is "+sumOfNatural);

        input.close();
    }
}
