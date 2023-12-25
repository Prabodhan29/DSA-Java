package com.Matrix;

public class MatrixToArray {
    public static void main(String[] args) {
        int[][] matrix = {{1,3,5,7},{10,11,20},{23,30,34,60}};
        int[] arr = convertToArray(matrix); // 1 3 5 7 10 11 16 20 23 30 34 60
        for(int i:arr) {
            System.out.print(i + " ");
        }
    }

    public static int[] convertToArray(int[][] matrix) {
        int[] arr = new int[matrix.length * matrix[0].length];
        int count = 0;

        // row-wise traversal
        for(int row=0; row<matrix.length; row++) {
            for(int col=0; col<matrix[row].length; col++) {
                arr[count] = matrix[row][col];
                count++;
            }
        }

        return arr;
    }
}
