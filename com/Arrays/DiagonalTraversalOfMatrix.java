package com.Arrays;

import java.util.Arrays;

public class DiagonalTraversalOfMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(Arrays.toString(findDiagonalOrder(matrix)));
        // [1, 2, 4, 7, 5, 3, 6, 8, 9]
    }
    public static int[] findDiagonalOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[] res = new int[m * n];
        int row = 0;
        int column = 0;
        int i = 0;
        boolean goingUp = true;

        while(row < m && column < n) {
            // we are going up
            if(goingUp) {
                while(row > 0 && column < n-1) {
                    res[i] = matrix[row][column];
                    i++; row--; column++;
                }
                // to add the last element in res
                res[i] = matrix[row][column];
                i++;

                if(column == n-1) row++;
                else column++;
            }

            // we are going down
            else {
                while(column > 0 && row < m-1) {
                    res[i] = matrix[row][column];
                    i++; row++; column--;
                }
                res[i] = matrix[row][column];
                i++;

                if(row == m-1) column++;
                else row++;
            }

            // don't use goingUp = false -> we will not get the correct answer
            goingUp = !goingUp;
        }

        return res;
    }
}
