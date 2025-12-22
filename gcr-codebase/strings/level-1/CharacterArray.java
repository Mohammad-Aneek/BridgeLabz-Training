import java.util.Scanner;

public class CharacterArray {
    // to get a character array from a string using charAt
    public char[] getCharArrayUsingCharAt(String str) {
        char[] array = new char[str.length()];

        for (int index = 0; index < str.length(); index++) {
            array[index] = str.charAt(index);
        }

        return array;
    }

    // to get character array using in built method
    public char[] getCharArray(String str) {
        return str.toCharArray();
    }

    // to compare two character arrays 
    public boolean areArraysEqual(char[] array1, char[] array2) {
        if (array1.length != array2.length) {
            return false;
        }

        for (int index = 0; index < array1.length; index++) {
            if (array1[index] != array2[index]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);
        CharacterArray object = new CharacterArray();

        String str = input.next();
        char[] arrayUsingCharAt = object.getCharArrayUsingCharAt(str), array = object.getCharArray(str);
        if (object.areArraysEqual(arrayUsingCharAt,array)) {
            System.out.println("Both results are same");
        } else {
            System.out.println("Results are different");
        }

    }

}
