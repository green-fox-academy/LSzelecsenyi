//Create a function that takes a number returns a matrix (list of lists) with height and width as the number, all of it's elments should be zero, beside the main diagonal should be ones like:
//
//        1 0 0 0 0
//        0 1 0 0 0
//        0 0 1 0 0
//        0 0 0 1 0
//        0 0 0 0 1

import java.util.Arrays;

public class FinalExamExercise {

    public static void main(String[] args) {

        drawMatrix(10);
    }

    public static int[][] drawMatrix(int size) {
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j == i) {
                    matrix[i][j] = 1;
                } else
                matrix[i][j] = 0;
            }
        }
//        for (int[] row : matrix)                  //other solution
//            Arrays.fill(row, 0);
//        for (int i = 0; i < size; i++) {
//            matrix[i][i] = 1;
//        }
//        for (int i = 0; i < size; i++) {          //for printing
//            System.out.println("\r");
//            for (int j = 0; j < size; j++) {
//                System.out.print(matrix[i][j]);
//            }
//        }
        return matrix;
    }
}
