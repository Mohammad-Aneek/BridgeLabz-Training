import java.util.Scanner;

// to calculate chocolates per student and remaining chocolates
public class Chocolate {

    // to perform the division and return an array of quotient and remainder 
    public static int[] findRemainderAndQuotient(int dividend, int divisor) {
        int quotient = dividend / divisor;
        int remainder = dividend % divisor;
        return new int[]{quotient,remainder};
    }

    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        int totalChocolates = input.nextInt();
        int totalStudents = input.nextInt();

        // use method to get the result
        int []result = findRemainderAndQuotient(totalChocolates,totalStudents);
        int chocolatesPerStudent = result[0];
        int remainingChocolates = result[1];

        // display the data 
        System.out.println("The number of chocolates per student is "+chocolatesPerStudent+" and there are "+remainingChocolates+" remaining chocolates for "+ totalChocolates + " chocolates and "+totalStudents + " students");

        // close the Scanner
        input.close();
    }
}
