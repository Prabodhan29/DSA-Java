package com.Matrix;

public class PrintLikeASineWave {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};

        int[] res = sineWavePrint(matrix);
        for (int re : res) {
            System.out.print(re + " "); // 1 5 9 10 6 2 3 7 11 12 8 4
        }
    }

    public static int[] sineWavePrint(int[][] matrix) {
        // length of matrix = number of row * number of columns
        int[] res = new int[matrix.length * matrix[0].length];
        int i = 0;

        for(int col=0; col<matrix[0].length; col++) {
            if(col % 2 == 0) {
                // even column index -> go top to bottom
                for(int row=0; row<matrix.length; row++) {
                    res[i] = matrix[row][col];
                    i++;
                }
            }
            else {
                // odd column index -> go bottom to top
                for(int row=matrix.length-1; row>=0; row--) {
                    res[i] = matrix[row][col];
                    i++;
                }
            }
        }

        return res;
    }
}
