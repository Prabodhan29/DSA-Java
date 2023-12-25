package com.Arrays;

import java.util.Arrays;

public class ConcatenationOfArrays {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(Arrays.toString(getConcatenation(nums)));
        // [1, 2, 3, 4, 1, 2, 3, 4]
    }

    public static int[] getConcatenation(int[] nums) {
        int[] res = new int[2 * nums.length];
        for(int i = 0; i < nums.length; i++) {

            // copy the original array
            res[i] = nums[i];

            // copy the original array but after the total length
            // of the original array.
            res[i + nums.length] = nums[i];
        }
        return res;
    }
}
