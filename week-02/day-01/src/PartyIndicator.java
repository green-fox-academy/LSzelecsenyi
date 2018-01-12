// Write a program that asks for two numbers
// Thw first number represents the number of girls that comes to a party, the
// second the boys
// It should print: The party is exellent!
// If the the number of girls and boys are equal and there are more people coming than 20
//
// It should print: Quite cool party!
// It there are more than 20 people coming but the girl - boy ratio is not 1-1
//
// It should print: Average party...
// If there are less people coming than 20
//
// It should print: Sausage party
// If no girls are coming, regardless the count of the people

import java.util.Scanner;

public class PartyIndicator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Give the number of girls at the party!");
        int girls = sc.nextInt();
        System.out.println("Give the number of boys at the party!");
        int boys = sc.nextInt();

        if (girls == 0) {
            System.out.println("Sausage party");
        } else if ((boys + girls) < 20) {
            System.out.println("Average party...");
        } else if ((girls == boys) && ((girls + boys) > 20)) {
            System.out.println("The party is excellent!");
        } else if (((girls % boys) != 0) && ((boys + girls) > 20)) {
            System.out.println("Quite cool party!");
        }
    }
}
