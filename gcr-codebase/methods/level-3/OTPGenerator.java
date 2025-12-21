public class OTPGenerator {
    // to generate OTP array 
    public int[] getOTPArray() {
        int []array = new int[10];

        for (int counter = 0; counter < 10; counter++) {
            double OTP = Math.random() * 900000 + 100000;
            array[counter] = (int)OTP;
        }

        return array;
    }

    // check an array for duplicates 
    public boolean containsDuplicates(int []array) {
        for (int outerCounter = 0; outerCounter < array.length; outerCounter++) {
            for (int innerCounter = outerCounter+1; innerCounter < array.length; innerCounter++) {
                if (array[innerCounter] == array[outerCounter]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        OTPGenerator object = new OTPGenerator();
        int array[] = object.getOTPArray();
        if (object.containsDuplicates(array)) {
            System.out.println("contains duplicates");
        } else {
            System.out.println("No duplicates");
        }
    }
}
