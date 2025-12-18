import java.util.Scanner;

// to calculate maximum number of Handshakes
public class Handshakes {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // total number of students
        int numberOfStudents = input.nextInt();

        // calculate and store number of Handshakes
        int totalHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        // display the data 
        System.out.println("The maximum number of handshakes amomg "+ numberOfStudents + " students is "+totalHandshakes);

        // close the Scanner
        input.close();
    }
}
