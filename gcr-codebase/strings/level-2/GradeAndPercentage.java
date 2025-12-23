import java.util.Scanner;

public class GradeAndPercentage {

    public int[][] getRandomArray(int size) {
        int startRange = 10 ,endRange = 100; 
        int [][]scores = new int[size][3];

        for (int outerCounter = 0; outerCounter < 3; outerCounter++) {
            for (int counter = 0; counter < size; counter++) {
                int randomValue = (int) ((endRange - startRange) * Math.random() + startRange);
                scores[counter][outerCounter] = randomValue;
            }
        }

        return scores;
    }

    public int[][] getTotalAndPercentage(int [][]scores) {
        int size = scores.length;
        int [][]totalAndPercentage = new int[size][2];

        for (int counter = 0; counter < size; counter++) {
            totalAndPercentage[counter][0] = scores[counter][0] + scores[counter][1] + scores[counter][2];
            totalAndPercentage[counter][1] = Math.round(totalAndPercentage[counter][0] / 3);
        }

        return totalAndPercentage;
    }

    public String[][] getGradesAndRemarks(int[][] totalAndPercentage) {
        String [][]grades = new String[totalAndPercentage.length][2];

        for (int i = 0; i < totalAndPercentage.length; i++) {
            if (totalAndPercentage[i][1] >= 80) {
                grades[i][0] = "A";
                grades[i][1] = "Level 4, above agency-normalized standards";
            } else if (70 <= totalAndPercentage[i][1]) {
                grades[i][0] = "B";
                grades[i][1] = "Level 3, at agency-normalized standards";
            } else if (60 <= totalAndPercentage[i][1]) {
                grades[i][0] = "C";
                grades[i][1] = "Level 2, below, but approaching agency-normalized standards";
            } else if (50 <= totalAndPercentage[i][1]) {
                grades[i][0] = "D";
                grades[i][1] = "Level 1, well below agency-normalized standards";
            } else if (40 <= totalAndPercentage[i][1]) {
                grades[i][0] = "E";
                grades[i][1] = "Level 1, too below agency-normalized standards";
            } else {
                grades[i][0] = "R";
                grades[i][1] = "Remedial standards";
            }
        }

        return grades;
    }

    public void display(int[][] scores, int[][] totalAndPercentage, String[][] gradesAndRemarks) {
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%d\t%d\t%d\t%d\t%d\t%2s\t%s\n",scores[i][0],scores[i][1],scores[i][2],totalAndPercentage[i][0],totalAndPercentage[i][1],gradesAndRemarks[i][0],gradesAndRemarks[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        GradeAndPercentage object = new GradeAndPercentage();

        int numberOfStudents = input.nextInt();

        int[][] scores = object.getRandomArray(numberOfStudents);

        int [][] totalAndPercentage = object.getTotalAndPercentage(scores);

        String[][] gradesAndRemarks = object.getGradesAndRemarks(totalAndPercentage);
        
        object.display(scores,totalAndPercentage,gradesAndRemarks);
    }
}
