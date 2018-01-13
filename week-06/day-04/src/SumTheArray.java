import java.util.Arrays;

public class SumTheArray {

    public static void main(String[] args) {

        Integer[] arrayToSum1 = {3, 6, 66, 4, 64, 13, 43, 5, 8};
        Double[] arrayToSum2 = {3.43, 6.5, 66.5665, 4.65, 64.82, 13.78, 43.789, 5.678, 8.767};
        Float[] arrayToSum3 = {3.445f, 6.5657f, 66.34f, 4.553f, 64.76453f, 13.57689f, 43.4224f, 5.3264236f, 8.45324f};
        sumArray(arrayToSum1, 4);
        sumArray(arrayToSum2, 9);
        sumArray(arrayToSum3, 10);
    }

    public static <T extends Number> void sumArray(T[] array, Integer length) {
        Float sum = 0f;
        double sumInCaseOfExeption = 0d;
        try {
            for (int i = 0; i < length; i++) {
                sum += array[i].floatValue();
            }
            System.out.println("sum of the numbers in array until given position is: " + sum);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Array is shorter than the given number...");
            for (int i = 0; i < array.length; i++) {
                sumInCaseOfExeption += array[i].doubleValue();
            }
            System.out.println("... but the sum of the whole array is: " + sumInCaseOfExeption);
        } finally {
            System.out.println("The array's elements are: " + Arrays.toString(array) + "\n");
        }
    }
}
