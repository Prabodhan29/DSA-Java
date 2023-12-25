package com.Arrays;

public class JumpGame {
    public static void main(String[] args) {
        int[] nums1 = {2, 3, 1, 1, 4};
        int[] nums2 = {3, 2, 1, 0, 4};
        System.out.println(canJump(nums1)); // true
        System.out.println(canJump(nums2)); // false
    }

    public static boolean canJump(int[] nums) {
        int reachable = 0;
        for(int i = 0; i < nums.length; i++) {
            if(i > reachable) return false;

            reachable = Math.max(reachable, i+nums[i]);
        }
        return true;
    }
}
