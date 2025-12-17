// Program to Calculate Age using Year of birth and current year
public class AgeCalculator {
    public static void main(String[] args) {
        // String variable for name
        String name = "Harry";

        // Integer variable for year of birth
        int yearOfBirth = 2000;

        // Integer variable for current year
        int currentYear = 2024;

        // Calculating age using currentYear and yearOfBirth
        // and storing it in a new variable named age
        int age = currentYear - yearOfBirth;

        // Displaying the data
        System.out.println(name + "'s age in "+ currentYear + " is " + age);
    }
}
