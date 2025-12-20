import java.util.Scanner;

public class BMICalculator {

    public static double getBMI(double personData[]) {
        double weight = personData[0];
        double height = personData[1];

        double BMI = weight / Math.pow(height,2);

        return BMI;
    }

    public static String getStatus(double personData[]) {
        double BMI = personData[2];

        if (BMI <= 18.4) {
            return "Underweight";
        } else if (BMI <= 24.9) {
            return "Normal";
        } else if (BMI <= 39.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    public static void main(String[] args) {
        // Create a scanner object
        Scanner input = new Scanner(System.in);

        int numberOfPersons = input.nextInt();

        // get the weight and height as input
        double[][] personData = new double[numberOfPersons][3];
        final byte weight = 0, height = 1, BMI = 2;

        for (int counter = 0; counter < numberOfPersons; counter++) {
            personData[counter][weight] = input.nextDouble();
            personData[counter][height] = input.nextDouble()/100;
        }

        // calculate BMI and check weight status
        String[] status = new String[numberOfPersons];

        for (int counter = 0; counter < numberOfPersons; counter++) {
            personData[counter][BMI] = getBMI(personData[counter]);
            status[counter] = getStatus(personData[counter]);
        }

        // display results
        for (int counter = 0; counter < numberOfPersons; counter++) {
            System.out.println("BMI is "+ personData[counter][BMI] + " and status is "+ status[counter] + " for the person whose weight is "+personData[counter][weight]+" and height is "+personData[counter][height]);
        }

        // close the Scanner
        input.close();
    }
}
