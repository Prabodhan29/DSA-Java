package com.Matrix;

import java.util.ArrayList;
import java.util.List;


public class MatrixAddition {
    public static void main(String[] args) {
        int[][] A = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] B = {{1,1,1},{1,1,1},{1,1,1}};
        System.out.println(matrixAddition(A, B)); // [[2, 3, 4], [5, 6, 7], [8, 9, 10]]
    }

    public static List<List<Integer>> matrixAddition(int[][] A, int[][] B) {
        List<List<Integer>> res = new ArrayList<>();

        if(A[0].length != B.length) return res;

        for(int i=0; i<A.length; i++) {
            List<Integer> temp = new ArrayList<>();
            for(int j=0; j<B[0].length; j++) {
                temp.add(A[i][j] + B[i][j]);
            }
            res.add(temp);
        }

        return res;
    }
}
