import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        // Creating a Scanner object
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in kg: ");
        double weightKg = input.nextDouble();

        System.out.print("Enter height in meters: ");
        double heightM = input.nextDouble();

        // Calculate BMI = weight / (height * height)
        double bmi = weightKg / (heightM * heightM);

        // Determine BMI category
        String category;
        if (bmi < 18.5) {
            category = "Underweight";
        } else if (bmi < 25.0) {
            category = "Normal";
        } else if (bmi < 30.0) {
            category = "Overweight";
        } else {
            category = "Obese";
        }

        // Display result
        System.out.printf("Your BMI is %.2f (%s).\n", bmi, category);
        input.close();
    }
}
