import java.util.Scanner;

public class UniqueFrequency {
    // to get length of string using looping and error handling
    public static int getLength(String str){
        int length = 0;
        try {
            while (true) {
                str.charAt(length);
                length++;
            }
        } catch (StringIndexOutOfBoundsException e) {
        } finally {
            return length;
        }
    }

    // to get Unique Characters
    public static char[] getUnique(String str){
        int length = getLength(str);
        char[] array = new char[length];
        int index = 0;

        for (int i = 0; i < length; i++) {
            int count = 0;
            for (int j = 0; j < length; j++) {
                if (str.charAt(i)==str.charAt(j)) {
                    count++;
                }
            }
            if (count == 1) {
                array[index++] = str.charAt(i); 
            }
        }

        char[] uniqueChars = new char[index];
        for (int i = 0; i < index; i++) {
            uniqueChars[i]=array[i];
        }
        return uniqueChars;
    }

    // to get frequency 
    public static String[][] getUniqueFrequency(String text) {
        int[] frequency = new int[256];
        int chars = 0;

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (frequency[c] == 0) {
                chars++;
            }
            frequency[c]++;
        }

        char[] unique = getUnique(text);
        String[][] fixedFrequency = new String[unique.length][2];
        int index = 0;
        for (char c : unique) {
            fixedFrequency[index][0] = c + "";
            fixedFrequency[index][1] = "1";
            index++;
        }

        return fixedFrequency;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        UniqueFrequency object = new UniqueFrequency();

        String text = input.nextLine();

        String[][] frequency = object.getUniqueFrequency(text);
        for (int i = 0; i < frequency.length; i++) {
            System.out.println(frequency[i][0] + " " + frequency[i][1]);
        }
        input.close();
    }
}

