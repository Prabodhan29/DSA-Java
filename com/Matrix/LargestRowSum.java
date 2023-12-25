package com.Matrix;

public class LargestRowSum {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        System.out.println(largestRowSum(matrix));
    }

    public static int largestRowSum(int[][] matrix) {
        int res = Integer.MIN_VALUE;

        for(int row=0; row<matrix.length; row++) {
            int temp_sum = 0;
            for(int col=0; col<matrix[row].length; col++) {
                temp_sum = temp_sum + matrix[row][col];
            }
            res = Math.max(res, temp_sum);
        }

        return res;
    }
}
