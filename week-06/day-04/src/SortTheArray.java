import java.util.Arrays;
import java.util.Collections;

public class SortTheArray {

    public static void main(String[] args) {

        Integer[] arrayToSort = {3, 6, 66, 4, 64, 13, 43, 5, 8};
        int[] arrayToSort2 = {1, 2, 55, 13, 42};

        sortArray(arrayToSort);
        System.out.println();
        sortArray2(arrayToSort);

    }

    public static  <T extends Number> void sortArray(T[] array) {
        T temp;
        try {
            for (int i = 0; i < array.length; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i].intValue() < array[j].intValue()) {
                        temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("enter valid data type!");
        } finally {
            System.out.println(Arrays.toString(array));
        }
    }

    public static <T extends  Number> void sortArray2(T[] array) {
        try {
            Arrays.sort(array, Collections.reverseOrder());
        } catch (Exception e) {
            System.out.println("enter valid data type!");
        } finally {
            System.out.println(Arrays.toString(array));
        }
    }

}
