import java.util.Scanner;

// Program to calculate number of rounds needed to run 5km around a triangular park
public class RoundsAroundPark {
    // method that uses the sides of triangles to calculate perimeter
    double getPermiter(double []sides) {
        double perimeter = 0;
        for (double side : sides) {
            perimeter += side;
        }
        return perimeter;
    } 

    // to calculate number of rounds using target distance and perimeter of park 
    double countRounds(double target, double perimeter) {
        double numberOfRounds = perimeter / target;
        return numberOfRounds;
    }

    public static void main(String[] args) {
        // Create a Scanner object and RoundsAroundPark object
        Scanner input = new Scanner(System.in);
        RoundsAroundPark object = new RoundsAroundPark();

        // taking the sides of triangle as input
        double []sides = new double[3];
        sides[0] = input.nextDouble();
        sides[1] = input.nextDouble();
        sides[2] = input.nextDouble(); 

        // use method to calculate perimeter
        double perimeter = object.getPermiter(sides);

        // use method to get number of rounds
        double target = 5;
        double numberOfRounds = object.countRounds(target, perimeter);

        // display result
        System.out.println("The total number of rounds needed is " + numberOfRounds);

        // close the Scanner
        input.close();
    }
}
