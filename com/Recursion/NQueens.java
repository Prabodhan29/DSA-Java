package com.Recursion;

import java.util.ArrayList;
import java.util.List;

public class NQueens {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(solveNQueens(n));
        // [[..Q., Q..., ...Q, .Q..], [.Q.., ...Q, Q..., ..Q.]]
    }

    public static List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];

        // fill the entire board with '.'
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                board[i][j] = '.';
            }
        }
        List<List<String>> res = new ArrayList<>();
        int col = 0;
        solve(col, board, res);

        return res;
    }

    // to fill the queens
    public static void solve(int col, char[][] board, List<List<String>> res) {
        // base condition
        if(col == board.length) {
            res.add(construct(board));
            return;
        }

        for(int row = 0; row < board.length; row++) {
            if(canPlaceQueen(board, row, col)) {
                board[row][col] = 'Q';
                solve(col+1, board, res);
                board[row][col] = '.';
            }
        }
    }

    // to construct the res list
    public static List<String> construct(char[][] board) {
        List <String> res = new ArrayList<>();
        for (char[] character : board) {
            String s = new String(character);
            res.add(s);
        }
        return res;
    }

    // to check whether we can place a queen at certain row and column
    // see Image 1
    public static boolean canPlaceQueen(char[][] board, int row, int col) {
        // we need duprow and dupcol as we are changing the values of row and columns
        // in the next while loop. duprow and dupcol store original values of row
        // and columns.
        int duprow = row;
        int dupcol = col;

        // to check upper diagonal
        while (row >= 0 && col >= 0) {
            if (board[row][col] == 'Q') return false;
            row--;
            col--;
        }

        row = duprow;
        col = dupcol;
        // to check horizontal left
        while (col >= 0) {
            if (board[row][col] == 'Q') return false;
            col--;
        }

        row = duprow;
        col = dupcol;
        // to check lower diagonal
        while (row < board.length && col >= 0) {
            if (board[row][col] == 'Q') return false;
            col--;
            row++;
        }

        // all the above conditions failed -> it is safe to place queen at the
        // given row and column.
        return true;
    }
}
