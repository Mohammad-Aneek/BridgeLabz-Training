import java.util.Scanner;

// to calculate Remainder and quotient after a division
public class RemainderAndQuotient {
    // to perform the division and return an array of 
    public static int[] findRemainderAndQuotient(int dividend, int divisor) {
        int quotient = dividend / divisor;
        int remainder = dividend % divisor;
        return new int[]{quotient,remainder};
    }

    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        int dividend = input.nextInt();
        int divisor = input.nextInt();

        // use method to get the result
        int []result = findRemainderAndQuotient(dividend,divisor);
        int quotient = result[0];
        int remainder = result[1];

        // display the data 
        System.out.println("The quotient is "+quotient+" and remainder is "+remainder+" for dividend "+ dividend + " and divisor "+divisor);

        // close the Scanner
        input.close();
    }
}
