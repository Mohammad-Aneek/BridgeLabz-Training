import java.util.Scanner;
public class FitnessTracker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int days = 0;
        int[] counts = new int[7];
        int totalPushups = 0;

        System.out.println("Sandeep's Weekly Workout Tracker");

        for (int i = 0; i < 7; i++) {
            System.out.print("Push-ups in day " + (i+1) + ": ");
            counts[i] = input.nextInt();
        }
        
        System.out.println("---------------------------------------");

        for (int count : counts) {
            if (count == 0) {
                System.out.println("Rest Day... (Skipped)");
                continue; 
            }
            System.out.println( count + " push-ups ");
            totalPushups += count;
        }

        double average = totalPushups / 7.0;

        System.out.println("Total Push-ups: " + totalPushups);
        System.out.printf("Daily Average : %.2f push-ups%n", average);
    }
}
