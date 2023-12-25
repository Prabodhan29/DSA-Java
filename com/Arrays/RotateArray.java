package com.Arrays;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        rotate(nums, k);
        System.out.println(Arrays.toString(nums)); // [5, 6, 7, 1, 2, 3, 4]
    }

    public static void rotate(int[] nums, int k) {
        // for cases when we have one element and k is 2
        // that is length of array is less than k
        k = k % nums.length;

        // complete reverse
        reverseArray(nums, 0, nums.length-1);

        // 1st reverse
        reverseArray(nums, 0, k-1);

        // 2nd reverse
        reverseArray(nums, k, nums.length-1);
    }

    public static void reverseArray(int[] nums, int start, int end) {
        while(start <= end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
