import java.util.Scanner;

// Program to find Smallest And Largest number among 3
public class SmallestAndLargest {
    // method that return an arry with 2 elements where 
    // first element is the Smallest and second element is the Largest
    public static int[] findSmallestAndLargest(int number1, int number2, int number3) {

        int smallest = Math.min(number1, number2);
        smallest = Math.min(smallest, number3);

        int largest = Math.max(number1,number2);
        largest = Math.max(largest, number3);

        return new int[]{smallest,largest};
    } 

    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // taking the numbers as input
        int []numbers = new int[3];
        numbers[0] = input.nextInt();
        numbers[1] = input.nextInt();
        numbers[2] = input.nextInt(); 

        // use method to get the Smallest and Largest
        int[] result = findSmallestAndLargest(numbers[0],numbers[1],numbers[2]);

        int smallest = result[0];
        int largest = result[1];

        // display result
        System.out.println("The smallest number is " + smallest + " and the largest is "+largest);

        // close the Scanner
        input.close();
    }
}
