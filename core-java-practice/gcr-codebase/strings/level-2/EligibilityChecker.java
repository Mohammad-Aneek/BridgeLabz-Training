import java.util.Scanner;

public class EligibilityChecker {
    // to get array of random elements
    public int[] getRandomArray(int startRange, int endRange, int size){
        int []array = new int[size];
        endRange++;

        for (int i = 0; i < size; i++) {
            array[i] = (int)(Math.random() * (endRange - startRange)) + startRange;
        }

        return array;
    }

    // to check if all ages in an array are eligible or not
    public String[][] areEligible(int[] ages){
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            result[i][0] = Integer.toString(ages[i]);
            if (ages[i] < 0) {
                result[i][1] = "Cannot Vote";
            } else if (ages[i] < 18) {
                result[i][1] = Boolean.toString(false);
            } else {
                result[i][1] = Boolean.toString(true);
            }
        }
        return result;
    }

    // display the result
    public void displayEligibiltyList(String[][] array) {
        System.out.printf("| %11s | %11s |%n","Age","Eligibility");
        System.out.println("-----------------------------");
        for (String[] ageAndStatus : array) {
            System.out.printf("| %11s | %11s |%n",ageAndStatus[0],ageAndStatus[1]);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        EligibilityChecker object = new EligibilityChecker();
        int number = input.nextInt();
        String[][] result = object.areEligible(object.getRandomArray(10,99,number));
        object.displayEligibiltyList(result);
    }
}
