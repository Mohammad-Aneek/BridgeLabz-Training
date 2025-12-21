public class NumberCheckerFirst {
    // to check if a number is perfect Number or not 
    public static boolean isPerfectNumber(int number) {
        if (number < 0) {
            return false;
        }

        int sum = 0;

        for (int counter = 1; counter < number; counter++) {
            if (number % counter == 0) {
                sum += counter;
            }
        }

        return sum == number;
    }

    // to check if a number is abundant number or not 
    public static boolean isAbundantNumber(int number) {
        if (number < 0) {
            return false;
        }

        int sum = 0;

        for (int counter = 1; counter < number; counter++) {
            if (number % counter == 0) {
                sum += counter;
            }
        }

        return sum > number;
    }

    // to check if a number is deficient number or not 
    public static boolean isDeficientNumber(int number) {
        if (number < 0) {
            return false;
        }

        int sum = 0;

        for (int counter = 1; counter < number; counter++) {
            if (number % counter == 0) {
                sum += counter;
            }
        }

        return sum < number;
    }

    // to check if a number is Strong number or not
    public static boolean isStrongNumber(int number) {
        int sum = 0;
        int temporaryNumber = number;

        int factorial[] = new int[10];
        factorial[0] = 1;
        for (int counter = 1; counter < 10; counter++) {
            factorial[counter] = factorial[counter-1] * counter;
        }

        while (temporaryNumber > 0) {
            int digit = temporaryNumber % 10;
            temporaryNumber /= 10;

            sum += factorial[digit];
        }

        return sum == number;
    }

    public static void main(String[] args) {
        int number = 145;
        System.out.println("Number: " + number);
        System.out.println("Is Perfect Number: " + isPerfectNumber(number));
        System.out.println("Is Abundant Number: " + isAbundantNumber(number));
        System.out.println("Is Deficient Number: " + isDeficientNumber(number));
        System.out.println("Is Strong Number: " + isStrongNumber(number));
    }
}
