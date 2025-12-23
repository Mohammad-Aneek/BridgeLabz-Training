import java.util.Scanner;

public class BMICalculator {

    public String[][] getBMIAndStatus(double personData[][]) {
        String [][]result = new String[personData.length][2];

        for (int i = 0; i < personData.length; i++) {
            double BMI = personData[i][0] / Math.pow(personData[i][1],2);
            result[i][0] = Double.toString(BMI);

            if (BMI <= 18.4) {
                result[i][1] = "Underweight";
            } else if (BMI <= 24.9) {
                result[i][1] = "Normal";
            } else if (BMI <= 39.9) {
                result[i][1] = "Overweight";
            } else {
                result[i][1] = "Obese";
            }
        }
        return result;
    }

    public String[][] getFullReport(double personData[][]) {
        String[][] resultBMIAndStatus = getBMIAndStatus(personData);
        String[][] fullReport = new String[personData.length][4];

        for (int i = 0; i < personData.length; i++) {
            fullReport[i][0] = Double.toString(personData[i][0]);
            fullReport[i][1] = Double.toString(personData[i][1]);
            fullReport[i][2] = resultBMIAndStatus[i][0];
            fullReport[i][3] = resultBMIAndStatus[i][1];
        }

        return fullReport;
    }

    public void display(String[][] fullReport){
        for (int i = 0; i < fullReport.length; i++) {
            System.out.printf("| %15s | %15s | %15s | %15s |%n",fullReport[i][0],fullReport[i][1],fullReport[i][2],fullReport[i][3]);
        }
    }

    public static void main(String[] args) {
        // Create a scanner object
        Scanner input = new Scanner(System.in);
        BMICalculator object = new BMICalculator();

        int numberOfPersons = 10;

        // get the weight and height as input
        double[][] personData = new double[numberOfPersons][2];

        for (int counter = 0; counter < numberOfPersons; counter++) {
            personData[counter][0] = input.nextDouble();
            personData[counter][1] = input.nextDouble()/100;
        }

        String[][] result = object.getFullReport(personData);
        object.display(result);

        // close the Scanner
        input.close();
    }
}
