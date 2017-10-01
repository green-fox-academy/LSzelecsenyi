import java.util.Scanner;

public class GMN {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("You will guess from 1 to... Give me the top range!");
        int topRange = sc.nextInt();

        int random = (int) (Math.random() * topRange + 1);
        int lives = 0;
        int guess = 0;

        if(topRange <= 10) {
            lives = 4;
        } else if(10 < topRange && topRange <= 20) {
            lives = 7;
        } else if(20 < topRange && topRange <= 30) {
            lives = 10;
        } else if(30 < topRange && topRange <= 40) {
            lives = 13;
        } else if(40 < topRange && topRange <= 50) {
            lives = 16;
        } else if(40 < topRange) {
            lives = 20;
        }

        System.out.println("You have " + lives + " lives. Start guessing!");

        while(guess != random) {
            guess = sc.nextInt();
            if(guess < 0 && guess > topRange) {
                System.out.println("Guess is out of range! Guess must be between 1 and " + topRange + "!");
            }
            if (guess > random) {
                lives--;
                if(lives == 0) {
                    System.out.println("GAME OVER YOU ARE A DEAD LOSER!");
                    break;
                }
                System.out.println("Too high. You have " + lives + " lives left.");
            } else if (guess < random) {
                lives--;
                System.out.println("Too low. You have " + lives + " lives left.");
                if(lives == 0) {
                    System.out.println("GAME OVER YOU ARE A DEAD LOSER!");
                    break;
                }
            } if (guess == random) {
                System.out.println("YOU FOUND MY NUMBER!!!: " + random);
            }
        }

    }

}