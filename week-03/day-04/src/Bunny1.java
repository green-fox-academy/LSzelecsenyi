// We have a number of bunnies and each bunny has two big floppy ears.
// We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).

public class Bunny1 {

    public static void main(String[] args) {

        System.out.println(bunny(4));
    }

    static int bunny(int n) {
        int ears = 0;
        if (n == 1) {
            return ears = 2;
        } else
            return 2 +  bunny(n - 1);
    }

}