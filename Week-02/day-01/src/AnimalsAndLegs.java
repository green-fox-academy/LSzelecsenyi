import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {
        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        // The seconf represents the number of pigs the farmer has
        // It should print how many legs all the animals have

        Scanner sc = new Scanner(System.in);
        System.out.println("Please tell me how many chickens you've got!");
        int chickens = sc.nextInt();
        System.out.println("Please tell me how many PIGs you've got!");
        int pigs = sc.nextInt();

        int numberOfLegs = 2 * chickens + 4 * pigs;

        System.out.println(numberOfLegs);

    }
}