package com.Recursion;

public class WordSearch {
    public boolean exist(char[][] board, String word) {
        for(int row=0; row<board.length; row++) {
            for(int col=0; col<board[0].length; col++) {

                // if word found in board, return true
                if(search(board, word, row, col, 0)) {
                    return true;
                }
            }
        }

        // word not found in board, return false
        return false;
    }

    public static boolean search(char[][] board, String word, int row, int col, int index) {
        // base conditions

        // if the word contains only one character
        if(index == word.length()) return true;

        // cannot find word
        if(row > board.length - 1 || row < 0 ||
                col > board[0].length - 1 || col < 0 ||
                board[row][col] != word.charAt(index)) {
            return false;
        }

        // mark the visited word
        board[row][col] = '#';

        // check up down left right and increment index by 1
        boolean res = search(board, word, row+1, col, index+1) ||
                search(board, word, row-1, col, index+1) ||
                search(board, word, row, col-1, index+1) ||
                search(board, word, row, col+1, index+1);

        // if the character at [row][col] is the required character, then continue
        // the recursive calls. Otherwise, the 2nd base condition will return false;
        board[row][col] = word.charAt(index);

        return res;
    }
}
