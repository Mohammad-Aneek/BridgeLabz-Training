import java.util.Scanner;

// to calculate bonus for employees
public class Bonus {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numberOfEmployees = 10;
        int []yearsOfService = new int[numberOfEmployees];
        double []salary = new double[numberOfEmployees];

        int counter = numberOfEmployees - 1;
        while (counter >= 0) {
            System.out.println("Enter salary and years of service for employee " + (counter + 1) + ": ");

            salary[counter] = input.nextDouble();
            yearsOfService[counter] = input.nextInt();

            if (salary[counter] < 0 || yearsOfService[counter] < 0) {
                System.out.println("Invalid inputs! Try again");
            } else {
                counter--;
            }
        }

        double []bonus = new double[numberOfEmployees];
        double []newSalary = new double[numberOfEmployees];
        double totalBonus = 0, totalSalary = 0, totalNewSalary = 0;

        for (counter = 0; counter < numberOfEmployees; counter++) {
            if (yearsOfService[counter] < 5) {
                bonus[counter] = salary[counter] * .02;
            } else {
                bonus[counter] = salary[counter] * .05;
            }

            newSalary[counter] = salary[counter] + bonus[counter];

            totalBonus += bonus[counter];
            totalSalary += salary[counter];
            totalNewSalary += newSalary[counter];
        }

        for (counter = 0; counter < numberOfEmployees; counter++) {
            System.out.printf(
                    "for employee %d: salary is %f, bonus is %f, and new salary is %f%n",
                    counter+1,
                    salary[counter],
                    bonus[counter],
                    newSalary[counter]
                );
        }

        System.out.println("Total Bonus is "+totalBonus);
        System.out.println("Total Salary is "+totalSalary);
        System.out.println("Total new Salary is "+totalNewSalary);

    }
}
