public class Reverse
{
    public static void main(String[] args) {

        int[] aj = {3, 4, 5, 6, 7};
        for (int i = 0; i < aj.length/2; i++) {
            int temp = aj[i];
            aj[i] = aj[aj.length  - (1 + i)];
            aj[aj.length - (1 + i)] = temp;
        }
        for (int i = 0; i < aj.length; i++) {
        System.out.print(aj[i]);
        }
    }
}

