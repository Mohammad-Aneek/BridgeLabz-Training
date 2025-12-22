import java.util.Scanner;
public class StringIllegalArgumentException {
    // to generate Exception
    public void getStringIllegalArgumentException(String text) {
        System.out.println(String.format("%d",text));
    }

    // to generate and handle Exception
    public void handleStringIllegalArgumentException(String text) {
        try {
            System.out.println(String.format("%d",text));
        } catch (IllegalArgumentException e) {
            System.out.println("Exception was handled");
        } catch (Exception e) {
            System.out.println("Exception was handled as General Exception"+e.getMessage());
        }
    }

    public static void main(String[] args) {
        StringIllegalArgumentException object = new StringIllegalArgumentException();
        Scanner input = new Scanner(System.in);
        String text = input.next();
        // object.getStringIllegalArgumentException(text);
        object.handleStringIllegalArgumentException(text);

    }
}
