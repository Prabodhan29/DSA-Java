package com.Arrays;

public class MaximumAverage {
    public static void main(String[] args) {
        int[] nums = {1,12,-5,-6,50,3};
        int k = 4;
        System.out.println(findMaxAverage(nums, k)); // 12.75
    }

    public static double findMaxAverage(int[] nums, int k) {
        // calculate the window sum -> the window will be of size k
        double window_sum = 0;
        for(int i=0; i<k; i++) {
            window_sum = window_sum + nums[i];
        }

        // the current max will be window_sum
        double max = window_sum;

        for(int i=k; i<nums.length; i++) {
            // move the window open position ahead and
            // calculate window_sum
            window_sum = window_sum + nums[i] - nums[i-k];

            max = Math.max(max, window_sum);
        }

        // average is sum / total number of elements
        // as the max is the maximum window sum and the
        // window is of size k, average will be max / k.
        // We need to return double value.
        return max/(double) k;
    }
}
