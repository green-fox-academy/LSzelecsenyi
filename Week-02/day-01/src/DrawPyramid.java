// Write a program that reads a number from the standard input, then draws a
// pyramid like this:
//
//
//    *
//   ***
//  *****
// *******
//
// The pyramid should have as many lines as the number was

import java.util.Scanner;

public class DrawPyramid {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("give me a whole number!");
        int number = sc.nextInt();

        String pyramid = "";


        for(int i = 1, k = 0; i <= number; ++i, k = 0) {
            for (int empty = 1; empty <= number - i; ++empty) {
                System.out.print(" ");
            }

            while (k != 2 * i - 1) {
                System.out.print("*");
                ++k;
            }

            System.out.println();

        }
    }
}
