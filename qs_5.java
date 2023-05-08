// create an interface that has the following method...

import java.util.Scanner;
interface MatrixOperations {
    void diagonalsMinMax(int a[][]);
}
class MatrixUtils implements MatrixOperations {
    @Override
    public void diagonalsMinMax(int a[][]) {
        int min1 = Integer.MAX_VALUE;
        int max1 = Integer.MIN_VALUE;
        int min2 = Integer.MAX_VALUE;
        int max2 = Integer.MIN_VALUE;
        int n = a.length;
        for (int i = 0; i < n; i++) {
            if (a[i][i] < min1) {
                min1 = a[i][i];
            }
            if (a[i][i] > max1) {
                max1 = a[i][i];
            }
            if (a[i][n-i-1] < min2) {
                min2 = a[i][n-i-1];
            }
            if (a[i][n-i-1] > max2) {
                max2 = a[i][n-i-1];
            }
        }

        System.out.println("Smallest Element - 1: " + min1);
        System.out.println("Greatest Element - 2: " + max1);
        System.out.println("Smallest Element - 1: " + min2);
        System.out.println("Greatest Element - 2: " + max2);
    }
}

public class qs_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // size of square matrix
        int size = scanner.nextInt();
        int[][] matrix = new int[size][size];
        //Enter the elements of the matrix
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        MatrixOperations matrixUtils = new MatrixUtils();
        matrixUtils.diagonalsMinMax(matrix);
}
}