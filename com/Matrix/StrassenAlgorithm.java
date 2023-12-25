package com.Matrix;

public class StrassenAlgorithm {
    public static void main(String[] args) {
        int[][] A = {{1, 2}, {3, 4}};
        int[][] B = {{5, 6}, {7, 8}};
        int[][] C = new int[2][2];
        matrixMultiplication(A, B, C);

        // print matrix C
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C[0].length; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void matrixMultiplication(int[][] A, int[][] B, int[][] C) {
        final int M1 = (A[0][0] + A[1][1]) * (B[0][0] + B[1][1]);
        final int M2 = (A[1][0] + A[1][1]) * B[0][0];
        final int M3 = A[0][0] * (B[0][1] - B[1][1]);
        final int M4 = A[1][1] * (B[1][0] - B[0][0]);
        final int M5 = (A[0][0] + A[0][1]) * B[1][1];
        final int M6 = (A[1][0] - A[0][0]) * (B[0][0] + B[0][1]);
        final int M7 = (A[0][1] - A[1][1]) * (B[1][0] + B[1][1]);

        C[0][0] = M1 + M4 - M5 + M7;
        C[0][1] = M3 + M5;
        C[1][0] = M2 + M4;
        C[1][1] = M1 - M2 + M3 + M6;
    }
}
