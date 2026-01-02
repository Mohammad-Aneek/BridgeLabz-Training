import java.util.Scanner;

public class GradeAndPercentage {
    public static void main(String[] args) {
        // Create a scanner object
        Scanner input = new Scanner(System.in);

        // get the marks as input
        int scoreInPhysics = input.nextInt(), scoreInChemistry = input.nextInt(), scoreInMaths = input.nextInt();

        // calculate average marks 
        int average = (scoreInMaths + scoreInChemistry + scoreInPhysics)/3;

        if (average >= 80) {
            System.out.println("You got grade A with an average of " + average);
            System.out.println("Remarks: Level 4, above agency-normalized standards");
        } else if (70 <= average && average <= 79) {
            System.out.println("You got grade B with an average of " + average);
            System.out.println("Remarks: Level 3, at agency-normalized standards");
        } else if (60 <= average && average <= 69) {
            System.out.println("You got grade C with an average of " + average);
            System.out.println("Remarks: Level 2, below, but approaching agency-normalized standards");
        } else if (50 <= average && average <= 59) {
            System.out.println("You got grade D with an average of " + average);
            System.out.println("Remarks: Level 1, well below agency-normalized standards");
        } else if (40 <= average && average <= 49) {
            System.out.println("You got grade E with an average of " + average);
            System.out.println("Remarks: Level 1, too below agency-normalized standards");
        } else if (0 <= average && average <= 39) {
            System.out.println("You got grade R with an average of " + average);
            System.out.println("Remarks: Remedial standards");
        } else {
            System.out.println("Invalid");
        }

        // close the Scanner
        input.close();
    }
}
