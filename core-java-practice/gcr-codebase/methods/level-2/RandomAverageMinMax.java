public class RandomAverageMinMax {
    // creates an array of random 4 digit numbers
    public int[] generate4DigitRandomArray(int size) {
        int array[] = new int[5];
        for (int counter = 0; counter < size; counter++) {
            array[counter] = (int)(Math.random() * 9000 + 1000);
        }
        return array;
    }

    // uses the elements in an array to get the average, Minimum number, and Maximum number 
    public double[] findAverageMinMax(int[] numbers) {
        double sum = 0, min = numbers[0], max = numbers[0];

        for (int number : numbers) {
            sum += number;
            min = Math.min(min, number);
            max = Math.max(max, number);
        }

        double average = sum / numbers.length;
        return new double[]{average,min,max};
    }
    public static void main(String[] args) {
        // create an object of RandomAverageMinMax class
        RandomAverageMinMax object = new RandomAverageMinMax();

        int []array = object.generate4DigitRandomArray(5);
        double []result = object.findAverageMinMax(array);

        double average = result[0];
        double min = result[1];
        double max = result[2];

        System.out.println("Average is " +average);
        System.out.println("Minimum number is " + min);
        System.out.println("Maximum number is " + max);
    }
}
