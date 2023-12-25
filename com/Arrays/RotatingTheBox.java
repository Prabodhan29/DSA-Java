package com.Arrays;

public class RotatingTheBox {
    public static void main(String[] args) {
        char[][] box = {{'#','.','*','.'},{'#','#','*','.'}};
        rotateTheBox(box);
        // [["#","."], ["#","#"], ["*","*"], [".","."]]
    }

    public static char[][] rotateTheBox(char[][] box) {
        // ROTATE THE BOX BY 90 DEGREE

        // see Image 1
        char[][] res = new char[box[0].length][box.length];

        for(int i=0; i<box.length; i++) {
            for(int j=0; j<box[i].length; j++) {
                res[j][i] = box[box.length - i - 1][j];
            }
        }

        int row_limit = box.length;
        int col_limit = box[0].length;

        // DROP THE STONES

        // we need to iterate in this way (see Image 1)
        for(int i=col_limit-1; i>=0; i--) {
            for(int j=0; j<row_limit; j++) {

                // stone found
                if(res[i][j] == '#') {
                    int current_row = i;

                    // increment the current_row till an empty space is found
                    while(current_row+1 < col_limit && res[current_row+1][j] == '.') {
                        current_row++;
                    }

                    // if an empty space is found, the current_row will not be
                    // equal to i -> so swap that empty space with stone
                    if(current_row != i) {
                        res[current_row][j] = '#';
                        res[i][j] = '.';
                    }
                }
            }
        }
        return res;
    }
}
