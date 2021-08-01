import java.util.Random;
import java.util.Scanner;

/**
 * Starter code for the "Guess My Number" exercise.
 */
public class GuessStarter {

    public static void main(String[] args) {
        
        int newNumber;
        
        //Prompt user to enter number
        System.out.println("Guess my random number: ");

        Scanner in = new Scanner(System.in);
        newNumber = in.nextInt();

        System.out.println("You guessed: " + newNumber);
        
        // pick a random number
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        System.out.printf("The random number is: "
        + number);
        //Difference between the numbers
        int difference = number - newNumber;
        System.out.println();
        System.out.printf("Only missed it by " + difference
        + " numbers");
        System.out.println();
        System.out.println("Better Luck next time");
        
    }

}
