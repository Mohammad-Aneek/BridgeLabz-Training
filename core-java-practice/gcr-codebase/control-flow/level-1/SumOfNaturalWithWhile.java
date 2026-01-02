import java.util.Scanner;

public class SumOfNaturalWithWhile {
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

        // calculate sum of n natural number using formula
        int sumOfNaturalUsingFormula = n * (n + 1) / 2;

        // calculate the sum of n natural number using while 
        int counter = 1;
        int sumOfNaturalUsingWhile = 0;
        while(counter <= n) {
            sumOfNaturalUsingWhile += counter;
            counter++;
        }

        // displaying the results
        System.out.println("The sum of natural numbers using while is "+sumOfNaturalUsingWhile);
        System.out.println("The sum of natural numbers using formula is "+sumOfNaturalUsingFormula);
        
        if(sumOfNaturalUsingWhile == sumOfNaturalUsingFormula) {
            System.out.println("Both are same.");
        } else {
            System.out.println("They are different.");
        }

        input.close();
    }
}
