package com.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    public static void main(String[] args) {
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        merge(intervals); // [[1,6],[8,10],[15,18]]
    }

    public static int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, (arr1, arr2) -> Integer.compare(arr1[0], arr2[0]));

        List<int[]> res = new ArrayList<>();
        int[] current_interval = intervals[0];

        // add current_interval in res, so that we can declare current_begin and
        // current_end as local variables.
        res.add(current_interval);

        for(int[] inter : intervals) {
            // see image 1
            int current_begin = current_interval[0];
            int current_end = current_interval[1];
            int next_begin = inter[0];
            int next_end = inter[1];

            // if elements overlap, update the end of current_interval
            if(current_end >= next_begin) {
                // update the end of current_interval
                current_interval[1] = Math.max(current_end, next_end);
            }

            // if elements do not overlap, update the current_interval with new interval
            // and move forward.
            else {
                current_interval = inter;
                res.add(current_interval);
            }
        }

        // to convert res to int[][]
        return res.toArray(new int[res.size()][]);
    }
}
