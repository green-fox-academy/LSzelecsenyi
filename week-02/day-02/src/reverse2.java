public class reverse2 {

    public static void main(String[] args) {

        int[] aj = {3, 4, 5, 6, 7};
        int[] reverse = new int[aj.length];

        for (int i = aj.length - 1, k = 0; i >= 0; i--, k++) {
            reverse[k] = aj[i];
        }
        for (int j = 0; j < aj.length; j++) {
            System.out.println(reverse[j]);
        }
    }
}
