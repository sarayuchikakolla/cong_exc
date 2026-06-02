import java.util.*;

public class p10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Random rand = new Random();

        int randomNumber = rand.nextInt(100) + 1;

        int guess;

        do {

            System.out.print("Enter your guess (1-100): ");
            guess = sc.nextInt();

            if (guess > randomNumber) {
                System.out.println("Too High!");
            }

            else if (guess < randomNumber) {
                System.out.println("Too Low!");
            }

            else {
                System.out.println("Correct Guess!");
            }

        } while (guess != randomNumber);

    }
}