import java.util.Scanner;

public class StringManipulation {
    // to convert lowercase characters to uppercase
    public static String toUpperCase(String str) {
        char[] array = str.toCharArray();

        for (int counter = 0; counter < array.length; counter++) {
            if ('a' <= array[counter] && array[counter] <= 'z') {
                array[counter] = (char)(array[counter] - ' ');
            }
        }

        return new String(array);
    }

    // to convert uppercase characters to lowercase
    public static String toLowerCase(String str) {
        char[] array = str.toCharArray();

        for (int counter = 0; counter < array.length; counter++) {
            if ('A' <= array[counter] && array[counter] <= 'Z') {
                array[counter] = (char)(array[counter] + ' ');
            }
        }

        return new String(array);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();

        System.out.println("toUpperCase: " + toUpperCase(text));
        System.out.println("toLowerCase: " + toLowerCase(text));
        
    }
}
