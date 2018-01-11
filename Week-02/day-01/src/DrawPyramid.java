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

        StringBuilder space = new StringBuilder("");
        StringBuilder asterisk = new StringBuilder("*");
        for (int i = 0; i < number; i++) {
            space.append(" ");
        }
        for (int i = 0; i < number; i++) {
            System.out.print(space);
            System.out.println(asterisk);
            space.deleteCharAt(0);
            asterisk.append("**");
        }
    }
}
