import java.util.Scanner;

// to find side of square from perimeter
public class SquareSide {
    public static void main(String[] args) {
        // Create the Scanner object
        Scanner input = new Scanner(System.in);

        // taking perimeter of square as input
        System.out.print("Enter the perimeter of the square: ");
        double perimeter = input.nextDouble();

        // calculating the side of square
        double side = perimeter/4;

        // display the data
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);

        input.close();
    }
}

