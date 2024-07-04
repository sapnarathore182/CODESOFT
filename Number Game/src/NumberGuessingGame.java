import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        // Generate a random number between 1 and 100
        Random rand = new Random();
        int numberToGuess = rand.nextInt(100) + 1;

        // Create a scanner to read user input
        Scanner scanner = new Scanner(System.in);

        int numberOfTries = 0;
        int guess;

        while (true) {
            // Ask the user to guess a number
            System.out.println("Guess a number between 1 and 100:");
            guess = scanner.nextInt();

            // Check if the user's guess is correct
            if (guess == numberToGuess) {
                System.out.println(" Congratulations! You found the number in " + numberOfTries + " tries.");
                break;
            } else if (guess < numberToGuess) {
                System.out.println("Your guess is too low. Try again!");
            } else {
                System.out.println("Your guess is too high. Try again!");
            }

            // Increment the number of tries
            numberOfTries++;
        }
    }
}//