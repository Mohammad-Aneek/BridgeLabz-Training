public class StringNullPointerException {
    // to generate Exception
    public void getStringNullPointerException() {
        String text = null;
        text.length();
    }

    // to generate and handle Exception
    public void handleStringNullPointerException() {
        String text = null;
        try {
            text.length();
        } catch (NullPointerException e) {
            System.out.println("Exception was handled");
        }
    }

    public static void main(String[] args) {
        StringNullPointerException object = new StringNullPointerException();

        // object.getStringNullPointerException();
        object.handleStringNullPointerException();

    }
}
