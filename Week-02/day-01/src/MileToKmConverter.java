import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        // Write a program that asks for an integer that is a distance in kilometers,
        // then it converts that value to miles and prints it

        Scanner sc = new Scanner(System.in);
        System.out.println("If you give me a distance in whole kilometers I'll \n tell you how much is that in miles! \n Please give the distance!");
        int km = sc.nextInt();

        double mile = km * 0.621371192;

        System.out.println(mile);

    }
}