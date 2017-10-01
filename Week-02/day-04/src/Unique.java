import java.util.*;

public class Unique {

    public static void main(String[] args) {

        makeItUnique();

    }

    static void makeItUnique() {
        ArrayList inputNumbers = new ArrayList();
        ArrayList sorted = new ArrayList();
        Scanner sc = new Scanner(System.in);
        String input = "";
        int n = 0;
        System.out.println("Please enter numbers followed by pushing the enter key \nIf you want to start sort " +
                            "your numbers just type \"start\"!");
        do {
            input = sc.next();
            if (!input.equals("start")) {
                n = Integer.parseInt(input);
                inputNumbers.add(n);
            }
        } while (!input.equals("start"));

        for (int i = 0; i < inputNumbers.size() ; i++) {
            if (!sorted.contains(inputNumbers.get(i))) {
                sorted.add(inputNumbers.get(i));
            }
        }
        System.out.println("Your unique numbers are: ");
        for (Object numbers : sorted) {
            System.out.print(numbers + " ");
        }


    }

}
