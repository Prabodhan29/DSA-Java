package com.Arrays;

import java.util.Arrays;

public class SquareOfSortedArray {
    public static void main(String[] args) {
        int[] nums = {-4, -1, 0, 3, 10};
        System.out.println(Arrays.toString(sortedSquares1(nums)));
        System.out.println(Arrays.toString(sortedSquares2(nums)));
        // [0, 1, 9, 16, 100]
    }

    public static int[] sortedSquares1(int[] nums) {
        int i = 0;
        for(int x : nums) {
            nums[i] = x * x;
            i++;
        }
        Arrays.sort(nums);
        return nums;
    }

    public static int[] sortedSquares2(int[] nums) {
        int[] res = new int[nums.length];
        int start = 0;
        int end = nums.length - 1;
        int i = nums.length - 1;

        while(start <= end) {
            if((nums[start] * nums[start]) > (nums[end] * nums[end])) {
                res[i] = nums[start] * nums[start];
                i--;
                start++;
            }
            else {
                res[i] = nums[end] * nums[end];
                i--;
                end--;
            }
        }
        return res;
    }
}
