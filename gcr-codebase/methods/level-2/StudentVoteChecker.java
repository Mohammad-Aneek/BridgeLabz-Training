import java.util.Scanner;
// to check if a student is eligible to vote or not 
public class StudentVoteChecker {
    public static boolean canStudentVote(int age) {
        if (age < 18) {
            return false;
        } else {
            return true;
        }
    }
    public static void main(String[] args) {
        // create a scanner object
        Scanner input = new Scanner(System.in);

        int []ages = new int[10];

        for (int counter = 0; counter < 10; counter++) {
            ages[counter] = input.nextInt();
        }

        for (int age : ages) {
            if (canStudentVote(age)) {
                System.out.println("Student with age " + age + " can vote");
            } else if (age < 0) {
                System.out.println(age + " is an invalid age");
            } else {
                System.out.println("Student with age " + age + " can not vote");
            }
        }
    }
}
