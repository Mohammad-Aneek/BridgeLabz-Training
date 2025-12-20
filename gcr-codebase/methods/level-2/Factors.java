import java.util.Scanner;

// to find factors, sum of factors, sum of square of factors, product of factors
public class Factors {
    // returns array of factors for the number
    public static int[] getFactors(int number) {
        int countOfFactors = 0;

        for (int counter = 1; counter <= number; counter++) {
            if (number%counter==0) {
                countOfFactors++;
            }
        }

        int []factors =  new int[countOfFactors];
        int index = 0;

        for (int counter = 1; counter <= number; counter++) {
            if (number % counter == 0) {
                factors[index] = counter;
                index++;
            }
        }

        return factors;
    }

    // sum of array elements
    public static int getSumOfArray(int []array) {
        int sumOfArray = 0;

        for (int element : array) {
            sumOfArray += element;
        }

        return sumOfArray;
    }

    // sum of square of array elements
    public static int getSumOfSquareOfArray(int []array) {
        int sumOfSquareOfArray = 0;

        for (int element : array) {
                sumOfSquareOfArray += Math.pow(element,2);
        }    
        return sumOfSquareOfArray;
    }

    // product of array elements
    public static int getProductOfArray(int []array) {
        int productOfArray = 1;

        for (int element : array) {
            productOfArray*=element;
        }

        return productOfArray;
    }

    public static void main(String[] args) {
        // Craete a Scanner object
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        int []factors = getFactors(number);
        int sumOfArray = getSumOfArray(factors);
        int sumOfSquareOfArray = getSumOfSquareOfArray(factors);
        int productOfArray = getProductOfArray(factors);

        System.out.print("The factors of "+number+" are :");
        for (int factor : factors) {
            System.out.print(factor+" ");
        }
        System.out.println();

        System.out.println("The sum of factors is " + sumOfArray );
        System.out.println("The sum of square of factors is " + sumOfSquareOfArray);
        System.out.println("The product of array is " + productOfArray);

        // close the Scanner
        input.close();
    }
}
