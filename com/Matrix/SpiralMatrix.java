package com.Matrix;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        System.out.println(spiralOrder(matrix)); // [1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7]
    }
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();

        // required indexes
        int row = matrix.length;
        int col = matrix[0].length;

        int starting_row = 0;
        int ending_row = row - 1;

        int starting_col = 0;
        int ending_col = col - 1;

        while(true) {
            // left to right
            for(int i=starting_col; i<=ending_col; i++) {
                res.add(matrix[starting_row][i]);
            }
            starting_row++;
            if(starting_row > ending_row || starting_col > ending_col) break; // see image 1

            // top to bottom
            for(int i=starting_row; i<=ending_row; i++) {
                res.add(matrix[i][ending_col]);
            }
            ending_col--;
            if(starting_row > ending_row || starting_col > ending_col) break; // see image 1

            // right to left
            for(int i=ending_col; i>=starting_col; i--) {
                res.add(matrix[ending_row][i]);
            }
            ending_row--;
            if(starting_row > ending_row || starting_col > ending_col) break; // see image 1

            // bottom to top
            for(int i=ending_row; i>=starting_row; i--) {
                res.add(matrix[i][starting_col]);
            }
            starting_col++;
            if(starting_row > ending_row || starting_col > ending_col) break; // see image 1
        }

        return res;
    }
}
