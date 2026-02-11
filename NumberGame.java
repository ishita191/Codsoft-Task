import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {

        Random r = new Random();
        Scanner sc = new Scanner(System.in);

        int number = r.nextInt(100) + 1;

        System.out.println("Guess a number between 1 to 100");
        System.out.println("You have 5 Attempts");

        for(int attempts = 1; attempts <= 5; attempts++)
        {
            System.out.print("Enter Guess: ");
            int guess = sc.nextInt();

            if(guess == number)
            {
                System.out.println("🎉 Correct Guess!");
                System.out.println("Attempts taken: " + attempts);
                break;
            }
            else if(guess > number)
            {
                System.out.println("Too High!");
            }
            else
            {
                System.out.println("Too Low!");
            }

            if (attempts == 5)
            {
                System.out.println("Game Over! Number was: " + number);
            }
        }
    }
}
