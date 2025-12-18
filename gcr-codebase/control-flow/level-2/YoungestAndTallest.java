import java.util.Scanner;

public class YoungestAndTallest {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Input age and height of Amar, Akbar, and Anthony
        int ageAmar = input.nextInt(), ageAkbar = input.nextInt(), ageAnthony = input.nextInt();
        double heightAmar = input.nextDouble(), heightAkbar = input.nextDouble(), heightAnthony = input.nextDouble();

        // finding youngest
        int youngest = Math.min(ageAmar, Math.min(ageAkbar, ageAnthony));

        if (ageAmar == youngest) {
            System.out.println("Amar is youngest");
        }
        if (ageAkbar == youngest) {
            System.out.println("Akbar is youngest");
        }
        if (ageAnthony == youngest) {
            System.out.println("Anthony is youngest");
        }

        // finding tallest 
        double tallest = Math.max(heightAmar, Math.max(heightAkbar, heightAnthony));

        if (heightAmar == tallest) {
            System.out.println("Amar is tallest");
        } 
        if (heightAkbar == tallest) {
            System.out.println("Akbar is tallest");
        }
        if (heightAnthony == tallest) {
            System.out.println("Anthony is tallest");
        }

        // close the Scanner
        input.close();
    }
}

