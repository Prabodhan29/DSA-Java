package com.Matrix;

public class SearchWhenRowsAndColsAreSorted {
    public static void main(String[] args) {
        int[][] matrix = {{10,20,30,40},{15,25,35,45},{28,29,37,49},{33,34,38,50}};
        int target = 37;
        System.out.println(search(matrix, target)); // true
    }

    public static boolean search(int[][] matrix, int target) {
        int current_row = 0;
        int current_col = matrix[0].length - 1;

        while(current_row < matrix.length && current_col >= 0) {
            if(matrix[current_row][current_col] == target) {
                return true;
            }
            else if(matrix[current_row][current_col] < target) {
                current_row++;
            }
            else if(matrix[current_row][current_col] > target) {
                current_col--;
            }
        }

        return false;
    }
}
