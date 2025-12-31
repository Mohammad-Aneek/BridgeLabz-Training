import java.util.Scanner;
public class LuckyDraw {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Diwali mela Lucky Draw");
        while (true) {
            System.out.print("Enter your guess (-1 to exit): ");
            int guess = input.nextInt();
            if (guess == -1) {
                System.out.println("Exited successfully");
                break;
            } else if (guess < 1) {
                System.out.println("Invalid input");
            }
            else if (guess % 15 == 0) {
                System.out.println("Congratulation! You won");
            } else {
                System.out.println("Better luck next Time.");
            }
        }
        System.out.println("Thankyou for playing");
    }
}
