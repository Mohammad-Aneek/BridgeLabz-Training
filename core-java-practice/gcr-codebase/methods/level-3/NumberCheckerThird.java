public class NumberCheckerThird {
    // count digits in a number 
    public static int getDigitCount(int number) {
        int countOfDigits = 0;
        while (number > 0) {
            countOfDigits++;
            number/=10;
        }
        return countOfDigits;
    }

    // get digit array using a number
    public static int[] getDigitArray(int number) {
        int countOfDigits = getDigitCount(number);
        int []digits = new int[countOfDigits];
        for (int counter = countOfDigits - 1; counter >= 0; counter--) {
            digits[counter] = number%10;
            number/=10;
        }
        return digits;
    }

    // to reverse an array 
    public static int[] getReverseArray(int[] digits) {
        int pointer1 = 0, pointer2 = digits.length - 1;

        while (pointer1 < pointer2) {
            int temp = digits[pointer1];
            digits[pointer1] = digits[pointer2];
            digits[pointer2] = temp;

            pointer1++;
            pointer2--;
        }

        return digits;
    }

    // to check if arrays are equal or not
    public static boolean areArraysEqual(int []array1, int []array2) {
        if (array1.length != array2.length) {
            return false;
        }

        for (int counter = 0; counter < array1.length; counter++) {
            if (array1[counter] != array2[counter]) {
                return false;
            }
        }
        return true;
    }

    // to check for palindrome
    public static boolean isPalindrome(int []digits) {
        int []reversedDigits = getReverseArray(digits);
        return areArraysEqual(digits,reversedDigits);
    }

    // to check if a number is duck number or not 
    public static boolean isDuckNumber(int []digits) {
        for (int digit : digits) {
            if (digit == 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int number = 121;
        int[] digits = getDigitArray(number);
        int[] reversed = getReverseArray(getDigitArray(number));

        System.out.print("Reversed Digits: ");
        for (int digit : reversed) {
            System.out.print(digit + " ");
        }
        System.out.println();

        System.out.println("Is Palindrome: " + isPalindrome(getDigitArray(number)));
        System.out.println("Is Duck Number: " + isDuckNumber(digits));
    }
}
