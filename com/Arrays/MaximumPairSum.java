package com.Arrays;

import java.util.Arrays;

public class MaximumPairSum {
    public static void main(String[] args) {
        int[] nums = {3, 5, 4, 2, 4, 6};
        System.out.println(maxPairSum(nums)); // 8
    }

    public static int maxPairSum(int[] nums) {
        Arrays.sort(nums);

        int start = 0;
        int end = nums.length - 1;
        int res = 0;

        while(start < end) {
            int sum = nums[start] + nums[end];
            res = Math.max(sum, res);
            start++;
            end--;
        }

        return res;
    }
}
