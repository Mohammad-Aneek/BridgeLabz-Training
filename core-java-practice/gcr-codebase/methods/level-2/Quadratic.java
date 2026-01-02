import java.util.Scanner;

// to calculate roots of a Quadratic equation
public class Quadratic {

    public static double[] getRoots(double a, double b, double c) {
        double delta = Math.pow(b,2) - 4 * a * c;

        if (delta == 0) {
            double root = (double)-b / (2 * a);
            return new double[]{root};
        }

        if (delta < 0) {
            return new double[]{};
        }

        double roots[] = new double[2];
        roots[0] = (-b + Math.sqrt(delta)) / (2 * a);
        roots[1] = (-b - Math.sqrt(delta)) / (2 * a);

        return roots;
    }
    public static void main(String[] args) {
        // create a scanner object
        Scanner input = new Scanner(System.in);

        // ax^2 + bx + c 
        double a = input.nextInt(), b =input.nextInt(), c = input.nextInt();

        double []roots = getRoots(a,b,c);

        for (double root : roots) {
            System.out.println(root + " ");
        }

        // close the scanner object
        input.close();
    }
}
