import java.util.Scanner;

public class Palindrome {
    // check using double pointer
    public boolean check(String text) {
        int start = 0, end = text.length()-1;

        while (start <= end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    // check using recursion
    public boolean checkUsingRecursion(String text, int start, int end) {
        if (start >= end) {
            return true;
        }

        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }

        return checkUsingRecursion(text,start+1,end-1);
    }

    public boolean checkUsingRecursion(String text) {
        return checkUsingRecursion(text, 0, text.length()-1);
    }

    public String reverse(String text){
        String newString = "";
        for (int i = text.length()-1; i >= 0 ; i--) {
            newString += text.charAt(i);
        }

        return newString;
    }
    // check using array
    public boolean checkUsingArray(String text) {
        char[] array1 = text.toCharArray();
        char[] array2 = reverse(text).toCharArray();

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.next();
        Palindrome object = new Palindrome();

        System.out.println("Check " + object.check(text));
        System.out.println("Check using recursion " + object.checkUsingRecursion(text));
        System.out.println("Check using array " + object.checkUsingArray(text));
    }
}
