import java.util.Scanner;

// to perform Trigonometric functions
public class TrigonometricFunctions {

    // to calculate maximum number of handshakes amomg some number of students
    public double[] calculateTrigonometricFunctions(double angleInDegrees) {
        double angleInRadians = Math.toRadians(angleInDegrees); //angleInDegrees * 3.14 / 180;

        double sine = Math.sin(angleInRadians);
        double cosine = Math.cos(angleInRadians);
        double tangent = Math.tan(angleInRadians);

        return new double[]{sine,cosine,tangent};
    }

    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);
        TrigonometricFunctions object = new TrigonometricFunctions();

        double angleInDegrees = input.nextDouble();

        // use method to get values
        double []result = object.calculateTrigonometricFunctions(angleInDegrees);

        double sine = result[0];
        double cosine = result[1];
        double tangent = result[2];

        // display the data 
        System.out.println("sin("+angleInDegrees+") = "+sine);
        System.out.println("cos("+angleInDegrees+") = "+cosine);
        System.out.println("tan("+angleInDegrees+") = "+tangent);

        // close the Scanner
        input.close();
    }
}
