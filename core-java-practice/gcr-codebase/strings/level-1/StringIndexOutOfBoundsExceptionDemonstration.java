import java.util.Scanner;

public class StringIndexOutOfBoundsExceptionDemonstration {
    // to generate Exception
    public void getStringIndexOutOfBoundsException(String text) {
        text.charAt(text.length());
    }

    // to generate and handle Exception
    public void handleStringIndexOutOfBoundsException(String text) {
        try {
            text.charAt(text.length());
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception was handled");
        }
    }

    public static void main(String[] args) {
        // create a scanner and class object 
        Scanner input = new Scanner(System.in);
        StringIndexOutOfBoundsExceptionDemonstration object = new StringIndexOutOfBoundsExceptionDemonstration();

        String text = input.next();

        // object.getStringIndexOutOfBoundsException(text);
        object.handleStringIndexOutOfBoundsException(text);

    }
}
