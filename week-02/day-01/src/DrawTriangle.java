// Write a program that reads a number from the standard input, then draws a
// triangle like this:
//
// *
// **
// ***
// ****
//
// The triangle should have as many lines as the number was

import java.util.Scanner;

public class DrawTriangle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("give me a whole number!");
        int number = sc.nextInt();
        String str = "";
        for (int i = 0; i < number; i++) {
            System.out.println(str += "*");
        }
    }
}
