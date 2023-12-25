package com.Matrix;

public class BinarySearch {
    public static void main(String[] args) {
        int[][] matrix = {{3,4,7,9},{12,13,16,18},{20,21,23,29}};
        int target = 29;
        System.out.println(binarySeach(matrix, target)); // true
    }

    public static boolean binarySeach(int[][] matrix, int target) {
        int start = 0; // index of the first element
        int end = matrix.length * matrix[0].length - 1; // index of the last element

        while(start <= end) {
            int mid = start + (end - start) / 2;
            int row = mid / matrix[0].length; // row = index / no. of columns
            int col = mid % matrix[0].length; // col = index % no. of columns

            if(matrix[row][col] == target) return true;
            else if(matrix[row][col] < target) start = mid + 1;
            else end = mid - 1;
        }

        return false;
    }
}
