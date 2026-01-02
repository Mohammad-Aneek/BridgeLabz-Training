import java.util.Scanner;

public class GradeAndPercentage {
    public static void main(String[] args) {
        // Create a scanner object
        Scanner input = new Scanner(System.in);

        int numberOfStudents = input.nextInt();

        int[][] score = new int[numberOfStudents][3];
        int[] percentage = new int[numberOfStudents];
        char[] grades = new char[numberOfStudents];

        final byte physics = 0, chemistry = 1, maths = 2;

        for (int counter = 0; counter < numberOfStudents; counter++) {
            score[counter][physics] = input.nextInt();
            score[counter][chemistry] = input.nextInt();
            score[counter][maths] = input.nextInt();
        }

        // calculate percentage and grade
        for (int counter = 0; counter < numberOfStudents; counter++) {
            int total = score[counter][physics] + score[counter][chemistry] + score[counter][maths];
            percentage[counter] = total/3;

            if (percentage[counter] >= 80) {
                grades[counter] = 'A';
            } else if (percentage[counter] >= 70) {
                grades[counter] = 'B';
            } else if (percentage[counter] >= 60) {
                grades[counter] = 'C';
            } else if (percentage[counter] >= 50) {
                grades[counter] = 'D';
            } else if (percentage[counter] >= 40) {
                grades[counter] = 'E';
            } else {
                grades[counter] = 'R';
            }
        }

        // Display the data 
        for (int counter = 0; counter < numberOfStudents; counter++) {
            System.out.printf(
                    "The score in physics, chemistry, and maths are %d, %d, and %d respectively making percentage %d and grade %c%n",
                    score[counter][physics],
                    score[counter][chemistry],
                    score[counter][maths],
                    percentage[counter],
                    grades[counter]
                );
        }
        // close the Scanner
        input.close();
    }
}
