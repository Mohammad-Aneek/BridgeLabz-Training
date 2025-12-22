import java.util.Scanner;

public class TrimString {
    // to find from which index actual content start and upto which index it lasts
    public int[] getTrimIndexes(String str){
        int startIndex = 0;
        int endIndex = str.length() - 1;

        while (startIndex <= endIndex) {
            if (str.charAt(startIndex) != ' ') {
                break;
            }
            startIndex++;
        }

        while (startIndex <= endIndex) {
            if (str.charAt(endIndex) != ' ') {
                break;
            }
            endIndex--;
        }

        return new int[]{startIndex,endIndex};
    }

    // get substring using charAt method
    public String getSubStringUsingCharAt(String str, int startIndex, int endIndex) {
        char[] array = new char[endIndex - startIndex];

        for (int index = startIndex; index < endIndex; index++) {
            array[index - startIndex] = str.charAt(index);
        }

        return new String(array).intern();
    }

    // compares two strings by checking each and every character
    public boolean equalsUsingCharAt(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if(str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);
        TrimString object = new TrimString();

        String text = input.nextLine();

        int[] trimIndexes = object.getTrimIndexes(text);

        String customTrimmed = object.getSubStringUsingCharAt(text, trimIndexes[0],trimIndexes[1]+1);
        String trimmed = text.trim();

        if (object.equalsUsingCharAt(customTrimmed,trimmed)) {
            System.out.println("Both are same");
        } else {
            System.out.println("They are different");
        }

    }
}
