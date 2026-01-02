import java.util.Scanner;

// get substrings using different techniques and compare the result
public class SubString {
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

    // get substring using charAt method
    public String getSubStringUsingCharAt(String str, int startIndex, int endIndex) {
        char[] array = new char[endIndex - startIndex];

        for (int index = startIndex; index < endIndex; index++) {
            array[index - startIndex] = str.charAt(index);
        }

        return new String(array).intern();
    }

    // get substring using builtin method
    public String getSubstring(String str, int startIndex, int endIndex) {
        return str.substring(startIndex,endIndex);
    }

    public static void main(String[] args) {
        // Create a Scanner and a SubString class object
        Scanner input = new Scanner(System.in);
        SubString object = new SubString();

        String str1 = input.next();
        int startIndex = input.nextInt(), endIndex = input.nextInt();

        String substringtWithCharAt = object.getSubStringUsingCharAt(str1, startIndex, endIndex);
        String substring = object.getSubstring(str1, startIndex,endIndex);

        System.out.println("The result with charAt method is " + substringtWithCharAt);
        System.out.println("The result with inbuilt method is " + substring);

        if (object.equalsUsingCharAt(substring,substringtWithCharAt)) {
            System.out.println("Both are equal");
        }

    }
}
