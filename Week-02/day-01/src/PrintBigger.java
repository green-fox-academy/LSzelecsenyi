import java.util.Scanner;

public class PrintBigger {

    public static void main(String[] args) {

        // Write a program that asks for two numbers and prints the bigger one

        Scanner sc = new Scanner(System.in);
        System.out.println("Give me two whole numbers!");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a > b) {
            System.out.println(a);
        } else if(a == b) {
            System.out.println("They are even!");
        } else {
            System.out.println(b);
        }
    }
}
