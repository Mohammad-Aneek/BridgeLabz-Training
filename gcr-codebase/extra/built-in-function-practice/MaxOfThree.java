import java.util.Scanner;

public class MaxOfThree {
    // takes n numbers as input and creates an array
    public static int[] takeInput(int numberOfInputs){
        Scanner input = new Scanner(System.in);
        int []array = new int[numberOfInputs];

        for (int i = 0; i < numberOfInputs; i++) {
            array[i] = input.nextInt();
        }

        input.close();
        return array;
    }

    // find the index of the maximum number in the array
    public static int getMaxIndex(int []array) {
        if (array.length == 0) {
            return -1;
        }

        int maxIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[maxIndex] < array[i]) {
                maxIndex = i;
            }
        }

        return maxIndex;
    }
    public static void main(String[] args) {
        int[] array = takeInput(3);
        int maxIndex = getMaxIndex(array);

        System.out.println("The maximum number is " + array[maxIndex]);
    }
}
