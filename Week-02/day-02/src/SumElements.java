public class SumElements {

    public static void main(String[] args) {

// - Create an array variable named `r`
//   with the following content: `[54, 23, 66, 12]`
// - Print the sum of the second and the third element

    int[] r = {54, 23, 66, 12};
        System.out.println(sumElements(r[1], r[2]));
    }

    public static int sumElements(int a, int b) {
        int sum = a + b;
        return sum;
    }
}
