package com.Recursion;

public class SudokuSolver {
    public static void main(String[] args) {
        char[][] board= {
                {'9', '5', '7', '.', '1', '3', '.', '8', '4'},
                {'4', '8', '3', '.', '5', '7', '1', '.', '6'},
                {'.', '1', '2', '.', '4', '9', '5', '3', '7'},
                {'1', '7', '.', '3', '.', '4', '9', '.', '2'},
                {'5', '.', '4', '9', '7', '.', '3', '6', '.'},
                {'3', '.', '9', '5', '.', '8', '7', '.', '1'},
                {'8', '4', '5', '7', '9', '.', '6', '1', '3'},
                {'.', '9', '1', '.', '3', '6', '.', '7', '5'},
                {'7', '.', '6', '1', '8', '5', '4', '.', '9'}
        };

        solveSudoku(board);

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }

//        Output -
//        9 5 7 6 1 3 2 8 4
//        4 8 3 2 5 7 1 9 6
//        6 1 2 8 4 9 5 3 7
//        1 7 8 3 6 4 9 5 2
//        5 2 4 9 7 1 3 6 8
//        3 6 9 5 2 8 7 4 1
//        8 4 5 7 9 2 6 1 3
//        2 9 1 4 3 6 8 7 5
//        7 3 6 1 8 5 4 2 9
    }

    public static void solveSudoku(char[][] board) {
        solve(board);
    }

    public static boolean solve(char[][] board) {
        for(int i = 0; i < 9; i++) { // i is for rows
            for(int j = 0; j < 9; j++) { // j is for columns

                // if no element exist, then only try adding a number
                if(board[i][j] == '.') {
                    for(char c = '1'; c <= '9'; c++) {
                        if(canAddNumber(board, i, j, c)) {
                            board[i][j] = c;

                            // similar to add/pick in backtracking
                            if(solve(board)) return true;

                                // similar to don't add/pick in backtracking
                            else board[i][j] = '.';
                        }
                    }
                    // if no element is added -> that is, the else statement was
                    // executed in the above if condition.
                    return false;
                }
            }
        }

        // if we don't have a single empty cell -> that is, everything is filled up.
        return true;
    }

    // to check whether we can add a number or not.
    public static boolean canAddNumber(char[][] board, int row, int col, char element) {
        for(int i=0; i<9; i++) {

            // to check vertically (column stays the same, row changes),
            // if same number is present or not
            if(board[i][col] == element) {
                return false;
            }

            // to check horizontally (row stays the same, column changes),
            // if same number is present or not
            if(board[row][i] == element) {
                return false;
            }

            // to check the 3x3 sub-matrix of the entire sudoku
            if (board[3 * (row/3) + i / 3][3 * (col / 3) + i % 3] == element) {
                return false;
            }
        }

        // if all the above conditions fail -> that is, element can be added
        return true;
    }
}
