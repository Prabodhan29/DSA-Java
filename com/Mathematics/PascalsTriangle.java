package com.Mathematics;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static void main(String[] args) {
        int numRows = 13;
        System.out.println(generate(numRows).get(13-1));
        // [[1], [1, 1], [1, 2, 1], [1, 3, 3, 1], [1, 4, 6, 4, 1]]
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();

        // create the first row, which will have only 1
        List<Integer> first_row = new ArrayList<>();
        first_row.add(1);

        // add the first_row to res
        res.add(first_row);

        // start i from 1 because the first element is always fixed
        // which is 1 in a Pascal triangle
        for(int i=1; i<numRows; i++) {

            // get the previous_row which will be stored in res
            // for 1st iteration previous_row will be first_row or
            // res.get(i-1)
            List<Integer> previous_row = res.get(i-1);
            ArrayList<Integer> current_row = new ArrayList<>();

            // the current_row will be added to res, and the first element in
            // Pascal triangle is always 1.
            current_row.add(1);

            // fill the current_row with all the elements from the previous_row
            // except 1 (that's why j=1). Later, add 1 to current_row.
            for(int j=1; j<i; j++) {
                current_row.add(previous_row.get(j) + previous_row.get(j-1));
            }

            // the current_row will be added to res, and the last element in
            // Pascal triangle is always 1.
            current_row.add(1);
            res.add(current_row);
        }

        return res;
    }
}
