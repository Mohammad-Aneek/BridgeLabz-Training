import java.util.Scanner;
public class StringNumberFormatException {
    // to generate Exception
    public void getStringNumberFormatException(String text) {
        System.out.println(Integer.parseInt(text));
    }

    // to generate and handle Exception
    public void handleStringNumberFormatException(String text) {
        try {
            System.out.println(Integer.parseInt(text));
        } catch (NumberFormatException e) {
            System.out.println("Exception was handled");
        } catch (Exception e) {
            System.out.println("Exception was handled as General Exception"+e.getMessage());
        }
    }

    public static void main(String[] args) {
        StringNumberFormatException object = new StringNumberFormatException();
        Scanner input = new Scanner(System.in);
        String text = input.next();
        // object.getStringNumberFormatException(text);
        object.handleStringNumberFormatException(text);

    }
}
