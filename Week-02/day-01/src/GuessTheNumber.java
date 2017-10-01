// Write a program that stores a number, and the user has to figure it out.
// The user can input guesses, after each guess the program would tell one
// of the following:
//
// The stored number is higher
// The stried number is lower
// You found the number: 8

import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args) {

        int random = (int) (Math.random() * 10 + 1);
        Scanner sc = new Scanner(System.in);
        System.out.println("Give a number!");
        int guess = 0;

        while(guess != random) {
            guess = sc.nextInt();
            if (guess > random) {
                System.out.println("The stored number is lower");
            } else if (guess < random) {
                System.out.println("The stored number is higher");
            } if (guess == random) {
                System.out.println("You found the number: " + random);
            }
        }
    }
}
