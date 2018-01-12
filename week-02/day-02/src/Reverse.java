import java.util.Arrays;

public class Reverse {

    public static void main(String[] args) {
        int[] arr = new int[]{3, 4, 5, 6, 7, 8, 9};
        System.out.println(reverse(arr));
    }

    public static String reverse(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = arr[i];
            arr[i] = temp;
        }
        return Arrays.toString(arr);
    }
}
