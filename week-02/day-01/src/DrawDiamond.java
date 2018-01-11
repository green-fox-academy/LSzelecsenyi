import java.util.Scanner;

public class DrawDiamond {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("give me a whole number!");
        int number = sc.nextInt();
        int half = number / 2;

        StringBuilder space = new StringBuilder("");
        StringBuilder asterisk = new StringBuilder("*");
        for (int i = 0; i < number; i++) {
            space.append(" ");
        }
        for (int i = 0; i < half; i++) {
            System.out.print(space);
            System.out.println(asterisk);
            space.deleteCharAt(0);
            asterisk.append("**");
        }
        space.append(" ");
        asterisk.delete(0, 2);
        for (int i = 0; i < half - 1; i++) {
            space.append(" ");
            asterisk.delete(0, 2);
            System.out.print(space);
            System.out.println(asterisk);
        }
    }
}
