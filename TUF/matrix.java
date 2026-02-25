package TUF;

import java.util.*;

public class matrix {

    public static void spiralOrder(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        int top = 0, bottom = n - 1;
        int left = 0, right = m - 1;

        while (top <= bottom && left <= right) {

            for (int i = left; i <= right; i++) {   // Traverse right
                System.out.print(matrix[top][i] + " ");
            }
            top++;

            for (int i = top; i <= bottom; i++) {   // Traverse down
                System.out.print(matrix[i][right] + " ");
            }
            right--;

            if (top <= bottom) {              // Traverse left
                for (int i = right; i >= left; i--) {
                    System.out.print(matrix[bottom][i] + " ");
                }
                bottom--;   
            }

            if (left <= right) {          // Traverse up
                for (int i = bottom; i >= top; i--) {
                    System.out.print(matrix[i][left] + " ");
                }
                left++;
            }
        }
    }

    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        spiralOrder(matrix);
    }
}