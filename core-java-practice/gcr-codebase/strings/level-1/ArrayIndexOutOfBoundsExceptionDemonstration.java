import java.util.Scanner;

public class ArrayIndexOutOfBoundsExceptionDemonstration {
    // to generate Exception
    public void getArrayIndexOutOfBoundsException(String []array) {
        System.out.println(array[array.length]);
    }

    // to generate and handle Exception
    public void handleArrayIndexOutOfBoundsException(String []array) {
        try {
            System.out.println(array[array.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception was handled");
        }
    }

    public static void main(String[] args) {
        // create a scanner and class object 
        Scanner input = new Scanner(System.in);
        ArrayIndexOutOfBoundsExceptionDemonstration object = new ArrayIndexOutOfBoundsExceptionDemonstration();

        int count = input.nextInt();
        String[] array = new String[count];

        for (int i = 0; i < count; i++) {
            array[i] = input.next();
        }
 
        // object.getArrayIndexOutOfBoundsException(array);
        object.handleArrayIndexOutOfBoundsException(array);

    }
}
