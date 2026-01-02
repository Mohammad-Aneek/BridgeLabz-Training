/* 9. School Bus Attendance System 🚍
 * Track 10 students' presence.
 * ● Use for-each loop on names.
 * ● Ask "Present or Absent?"
 * ● Print total present and absent counts.
*/

import java.util.Scanner;

public class SchoolBusAttendanceSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String []students = {"Alice", "Bob", "Charlie", "David", "Eva", "Frank", "Grace", "Hannah", "Ivy", "Jack"};
        boolean []attendance = new boolean[students.length];
        int present = 0, ind = 0;
        for (String student : students) {
            System.out.printf("Is %s present? (yes/no): ",student);
            String choice = input.next();

            if (choice.toLowerCase().equals("yes")) {
                present++;
                attendance[ind++] = true;
            }
        }

        for (int i = 0; i < students.length; i++) {
            System.out.printf("%-9s  %-7s%n",students[i], attendance[i]?"present":"absent");
        }

        System.out.println("Total present: " + present);
        System.out.println("Total absent: " + (students.length - present));
    }
}
