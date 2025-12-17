// Class to calculate averaage of marks scored in 3 different subjects
public class AverageMarksCalculator {
    public static void main(String[] args) {
        // String variable to store name of the student
        String name = "Sam";

        // Integer variable to strore marks scored in Maths, Physics, and Chemistry
        int scoreInMaths = 94, scoreInPhysics = 95, scoreInChemistry = 96;

        // calculate the average and store it in a double variable
        double average = (scoreInMaths + scoreInPhysics + scoreInChemistry)/3;

        // Display the results
        System.out.println(name+"'s average mark in PCM is "+average);
    }
}
