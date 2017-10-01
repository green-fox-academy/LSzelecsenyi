// Write a recursive function that takes one parameter: n and counts down from n.

public class Counter {

    public static void main(String[] args) {

        counter(10);
    }

    static int counter(int input) {
        System.out.print(input + " ");
        if (input == 0) {
            return 0;
        } return counter(input - 1);
    }

}
