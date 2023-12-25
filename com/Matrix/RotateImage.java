package com.Matrix;

public class RotateImage {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        rotate(matrix); // [[7,4,1],[8,5,2],[9,6,3]]
    }

    public static void rotate(int[][] matrix) {
        // transpose of matrix (see image 1)
        transpose(matrix);

        // reverse each row (see image 1)
        reverseEachRow(matrix);
    }

    public static void transpose(int[][] matrix) {
        for(int i = 0; i < matrix.length; i++) {
            for(int j = i; j < matrix[i].length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    public static void reverseEachRow(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            // reverse using two pointer technique
            int start = 0;
            int end = matrix[row].length - 1;
            while (start < end) {
                int temp = matrix[row][start];
                matrix[row][start] = matrix[row][end];
                matrix[row][end] = temp;
                start++;
                end--;
            }
        }
    }
}
