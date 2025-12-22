import java.util.Scanner;

public class StringLength {
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
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String text = input.nextLine();

        System.out.println("User built length method: " + getLength(text));
        System.out.println("In built length method: " + text.length()); 
    }
}
