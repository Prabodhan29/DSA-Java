package com.Matrix;

import java.util.ArrayList;
import java.util.List;

public class MatrixMultiplication {
    public static void main(String[] args) {
        int[][] A = {{1,2,3,4}, {5,6,7,8},{0,0,0,0}};
        int[][] B = {{1,2,0,0}, {5,6,0,0}, {3,4,0,0}, {2,8,0,0}};
        System.out.println(matrixMultiplication(A, B)); // [[28, 58], [72, 138]]
    }

    public static List<List<Integer>> matrixMultiplication(int[][] A, int[][] B) {
        List<List<Integer>> res = new ArrayList<>();

        if(A[0].length != B.length) return res;

        for(int row_A=0; row_A<A.length; row_A++) {
            List<Integer> temp = new ArrayList<>();
            for(int col_B=0; col_B<B[0].length; col_B++) {
                int temp_sum = 0;
                for(int k=0; k<A[0].length; k++) {
                    temp_sum = temp_sum + (A[row_A][k] * B[k][col_B]);
                }
                temp.add(temp_sum);
            }
            res.add(temp);
        }

        return res;
    }
}
