import java.util.Scanner;

public class AverageOfInput {

public static void main(String[]args){

// Write a program that asks for 5 integers in a row,
// then it should print the sum and the average of these numbers like:
//
// Sum: 22, Average: 4.4

    Scanner sc = new Scanner(System.in);
    System.out.println("Give five whole numbers, I'll calculate the sum and the average of them!");
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int d = sc.nextInt();
    int e = sc.nextInt();

    int sum = a + b + c + d + e;
    int average = (a + b + c + d + e) / 5;

    System.out.println("Sum: " + sum);
    System.out.println("Average: " + average);

   }
}

