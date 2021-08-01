import java.util.Random;
import java.util.Scanner;

import jdk.tools.jlink.internal.SymLinkResourcePoolEntry;

/* 
*A program that chooses a random number, prompts
*the user to guess it, and displays the difference between the guess and the
*chosen number. It tells the user whether the guess is too high or too low, and then
*prompts the user for another guess.
*The program should continue until the user gets it right.
**/

public class MyGuessingGame {
    
    public static void main(String[] args) {
        
        int newNumber;
        //Prompt user to enter number
        System.out.println("Guess my random number: ");

        var in = new Scanner(System.in);
        newNumber = in.nextInt();

        // pick a random number
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        System.out.println(number);
        guess(newNumber, number);
        
    }
//recursive method that prompts user to guess their number and checks the values against each other.
    public static void guess(int m, int n) {
        
        int newNumber = m;
        int number = n;
        
        check(newNumber, number);
        //basecase for recursion
        if(newNumber != number){
            System.out.println("Guess again");
            //scan in the next value to be compared to the number
            var in = new Scanner(System.in);
            newNumber = in.nextInt();
            guess(newNumber, number);
    }else{
        System.out.println("You guessed the number");
        System.out.println("Thank you for playing");
    }

 }
 //Check the value of both numbers and return message that the answer was too high or too low.   
 public static void check(int c, int d) {
        int newNumber = c;
        int number = d;
        //number is too high
        if (newNumber > number){
            System.out.println("You guessed too high");
        //number is equal
        } else if (newNumber ==  number) {
            System.out.println("*************");
        //number is too low
        }else{
            System.out.println("You guessed too low");
        }
    }
  }

