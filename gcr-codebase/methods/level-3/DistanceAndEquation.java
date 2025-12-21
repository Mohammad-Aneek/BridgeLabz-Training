import java.util.Scanner;

public class DistanceAndEquation {
    // to calculate euclidean distance 
    public double getEuclideanDistance(int []x, int []y) {
        double distance = Math.sqrt(Math.pow(x[1] - x[0], 2) +  Math.pow(y[1] - y[0], 2));
        return distance;
    }

    // to return slope and y-intercept for 2 points as Equation of Line
    public double[] getLineEquation(int []x, int []y) {
        double slope = (double)(y[1] - y[0]) / (x[1] - x[0]);
        double yIntercept = y[0] - slope * x[0];

        return new double[]{slope, yIntercept};
    }

    public static void main(String[] args) {
        // create a Scanner object
        Scanner input = new Scanner(System.in);

        DistanceAndEquation object = new DistanceAndEquation();

        int[] x = new int[2], y = new int[2];
        x[0] = input.nextInt();
        y[0] = input.nextInt();
        x[1] = input.nextInt();
        y[1] = input.nextInt();

        System.out.println("euclidean distance is "+ object.getEuclideanDistance(x,y));

        double[] equation = object.getLineEquation(x, y);
        System.out.println("Equation of Line: y = " + equation[0] + "x + " + equation[1]);

        // close the Scanner
        input.close();
    }
}
