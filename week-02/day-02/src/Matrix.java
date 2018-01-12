// - Create (dynamically) a two dimensional array
//   with the following matrix. Use a loop!
//
//   1 0 0 0
//   0 1 0 0
//   0 0 1 0
//   0 0 0 1
//
// - Print this two dimensional array to the output

import java.util.Arrays;

public class Matrix {

    public static void main(String[] args) {
        int[][] multi = new int[4][4];
        for (int[] row : multi)
            Arrays.fill(row, 0);
        //fills up the 2d array with ones
        for (int i = 0; i < 4; i++) {
            multi[i][i] = 1;
        }
        //fills up with zeroes at the propriate places
        for (int i = 0; i < 4; i++) {
            System.out.println("\r");
            for (int j = 0; j < 4; j++) {
                System.out.print(multi[i][j]);
            }
        }
    }
}
