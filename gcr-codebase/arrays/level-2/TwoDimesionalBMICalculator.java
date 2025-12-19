import java.util.Scanner;

public class TwoDimensionalBMICalculator {
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
            personData[counter][BMI] = personData[counter][weight] / (personData[counter][height]*personData[counter][height]);

            if (personData[counter][BMI] <= 18.4) {
                status[counter] = "Underweight";
            } else if (personData[counter][BMI] <= 24.9) {
                status[counter] = "Normal";
            } else if (personData[counter][BMI] <= 39.9) {
                status[counter] = "Overweight";
            } else {
                status[counter] = "Obese";
            }
        }

        // display results
        for (int counter = 0; counter < numberOfPersons; counter++) {
            System.out.println("BMI is "+ personData[counter][BMI] + " and status is "+ status[counter] + " for the person whose weight is "+personData[counter][weight]+" and height is "+personData[counter][height]);
        }

        // close the Scanner
        input.close();
    }
}
