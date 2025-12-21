public class Bonus {
    // to get an array of random values in a range 
    public double[] getRandomArray(int startRange, int endRange, int size) {
        endRange++;
        double []array = new double[size];

        for (int counter = 0; counter < size; counter++) {
            int randomValue = (int) ((endRange - startRange) * Math.random() + startRange);
            array[counter] = randomValue;
        }

        return array;
    }

    // to calculate new salary and Bonus using salary and years of service 
    public double[][] getNewSalaryAndBonus(double []salary, double []yearsOfService) {
        int size = Math.min(salary.length, yearsOfService.length);
        double [][]newSalaryAndBonus = new double[2][size];

        for (int counter = 0; counter < size; counter++) {
            double bonus;
            if (yearsOfService[counter] < 5) {
                bonus = salary[counter] * .02;
            } else {
                bonus = salary[counter] * .05;
            }

            newSalaryAndBonus[0][counter] = salary[counter] + bonus;
            newSalaryAndBonus[1][counter] = bonus;
        }
        return newSalaryAndBonus;
    }

    // to get sum of array elements
    public double getArraySum(double []array){
        double sum = 0;
        for (double element : array) {
            sum+=element;
        }
        return sum;
    }

    public static void main(String[] args) {
        Bonus object = new Bonus();

        double []salary = object.getRandomArray(10000, 99999, 10);
        double []yearsOfService = object.getRandomArray(0,10, 10);
        double [][]newSalaryAndBonus = object.getNewSalaryAndBonus(salary,yearsOfService);
        
        System.out.println("-------------------------------------------------");
        System.out.printf("| %9s | %9s | %9s | %9s |%n","salary","YearofSer","newSalary","bonus");
        System.out.println("-------------------------------------------------");
        for (int counter = 0; counter < 10; counter++) {
            System.out.printf("| %9.2f | %9.0f | %9.2f | %9.2f |%n",salary[counter],yearsOfService[counter],newSalaryAndBonus[0][counter],newSalaryAndBonus[1][counter]);
        }
        System.out.println("-------------------------------------------------");

        System.out.println("Total old salary is " + object.getArraySum(salary));
        System.out.println("Total new salary is " + object.getArraySum(newSalaryAndBonus[0]));
        System.out.println("Total bonus is "+object.getArraySum(newSalaryAndBonus[1]));
    }
}
