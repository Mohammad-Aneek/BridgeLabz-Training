import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        // Create a scanner object
        Scanner input = new Scanner(System.in);

        int numberOfPersons = input.nextInt();

        // get the weight and height as input
        double[] weight = new double[numberOfPersons], height = new double[numberOfPersons]; 

        for (int counter = 0; counter < numberOfPersons; counter++) {
            weight[counter] = input.nextDouble();
            height[counter] = input.nextDouble()/100;
        }

        // calculate BMI and check weight status
        double[] BMI = new double[numberOfPersons];
        String[] status = new String[numberOfPersons];

        for (int counter = 0; counter < numberOfPersons; counter++) {
            BMI[counter] = weight[counter] / (height[counter]*height[counter]);

            if (BMI[counter] <= 18.4) {
                status[counter] = "Underweight";
            } else if (BMI[counter] <= 24.9) {
                status[counter] = "Normal";
            } else if (BMI[counter] <= 39.9) {
                status[counter] = "Overweight";
            } else {
                status[counter] = "Obese";
            }
        }

        // display results
        for (int counter = 0; counter < numberOfPersons; counter++) {
            System.out.println("BMI is "+ BMI[counter] + " and status is "+ status[counter] + " for the person whose weight is "+weight[counter]+" and height is "+height[counter]);
        }

        // close the Scanner
        input.close();
    }
}
