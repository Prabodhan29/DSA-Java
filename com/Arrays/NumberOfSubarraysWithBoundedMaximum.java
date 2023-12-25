package com.Arrays;

public class NumberOfSubarraysWithBoundedMaximum {
    public static void main(String[] args) {
        int[] nums = {2, 1, 4, 3};
        int left = 2;
        int right = 3;
        System.out.println(numSubarrayBoundedMax(nums, left, right)); // 3
    }

    public static int numSubarrayBoundedMax(int[] nums, int left, int right) {
        return m1(nums, right) - m1(nums, left-1);
    }

    public static int m1(int[] nums, int limit) {
        int res = 0;
        int count = 0;

        for(int i=0; i<nums.length; i++) {
            if(nums[i] <= limit) count++;
            else count = 0;

            res = res + count;
        }
        return res;
    }
}
