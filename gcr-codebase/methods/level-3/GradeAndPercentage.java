import java.util.Scanner;

public class GradeAndPercentage {

    public int[][] getRandomArray(int size) {
        int startRange = 10 ,endRange = 100; 
        int [][]scores = new int[3][size];

        for (int outerCounter = 0; outerCounter < 3; outerCounter++) {
            for (int counter = 0; counter < size; counter++) {
                int randomValue = (int) ((endRange - startRange) * Math.random() + startRange);
                scores[outerCounter][counter] = randomValue;
            }
        }

        return scores;
    }

    public int[][] getTotalAndPercentage(int [][]scores) {
        int size = scores[0].length;
        int [][]totalAndPercentage = new int[2][size];

        for (int counter = 0; counter < size; counter++) {
            totalAndPercentage[0][counter] = scores[0][counter] + scores[1][counter] + scores[2][counter];
            totalAndPercentage[1][counter] = Math.round(totalAndPercentage[0][counter] / 3);
        }

        return totalAndPercentage;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        GradeAndPercentage object = new GradeAndPercentage();

        int numberOfStudents = input.nextInt();

        int[][] scores = object.getRandomArray(numberOfStudents);

        int [][] totalAndPercentage = object.getTotalAndPercentage(scores);

        for (int counter = 0; counter < numberOfStudents; counter++) {
            System.out.printf(
                    "%d\t%d\t%d\t%d\t%d\t%d\n", 
                    counter + 1,
                    scores[0][counter],
                    scores[1][counter],
                    scores[2][counter], 
                    totalAndPercentage[0][counter],
                    totalAndPercentage[1][counter]
            );
        }

    }
}
