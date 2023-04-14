package Exercises.Exercise7;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        int randomNumber = rand.nextInt(100) + 1;

        System.out.println("Enter a number between 1 - 100");

        int tryCount = 0;

        while(true) {
            int playerGuess = scanner.nextInt();
            tryCount ++;

            if (playerGuess == randomNumber) {
                System.out.println("Correct! You win!");
                System.out.println("It took you " + tryCount + " tries.");
                break;
            } else if (playerGuess < randomNumber) {
                System.out.println("Nope! The number is higher. Guess again.");
            } else {
                System.out.println("Nope! The number lower. Guess again.");
            }
        }

        scanner.close();
    }
}
