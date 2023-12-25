package com.BinarySearch;

public class SearchA2DMatrix2 {
    public static void main(String[] args) {
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 3;
        System.out.println(searchMatrix(matrix, target)); // true
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        int row = 0;
        int column = matrix[0].length-1;

        while(row < matrix.length && column >= 0) {
            if(matrix[row][column] == target) {
                return true;
            }
            else if(matrix[row][column] < target) {
                row++;
            }
            else {
                column--;
            }
        }
        return false;
    }
}
