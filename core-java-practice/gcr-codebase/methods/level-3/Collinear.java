import java.util.Scanner;

public class Collinear {
    // to check if points are Collinear usng slope comparison
    public boolean areCollinearUsingSlope(double []x, double []y) {
        double slope1To2 = (y[1] - y[0]) / (x[1] - x[0]);
        double slope2To3 = (y[2] - y[1]) / (x[2] - x[1]);
        double slope1To3 = (y[2] - y[0]) / (x[2] - x[0]);

        return slope1To2 == slope2To3 && slope2To3 == slope1To3;
    }

    // to check if points are Collinear by checking if area made by them is 0 or not
    public boolean areCollinearUsingArea(double []x, double []y) {
        double area = .5 * ((x[0] - x[1]) * (y[1] - y[2]) - (y[0] - y[1]) * (x[1] - x[2]));
        return area == 0;
    }
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);
        Collinear object = new Collinear();


        double[] x = new double[3], y = new double[3];
        for (int counter = 0; counter < 3; counter++) {
            System.out.printf("Enter x%d y%d: ",counter+1,counter+1);
            x[counter] = input.nextInt();
            y[counter] = input.nextInt();
        }

        System.out.println("Collinear using Slope : " + object.areCollinearUsingSlope(x,y));
        System.out.println("Collinear using area : " + object.areCollinearUsingArea(x,y));

    }
}
