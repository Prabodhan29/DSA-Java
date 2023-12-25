package com.Arrays;

public class TrappingRainWater {
    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(height)); // 6
    }

    public static int trap(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int left_max = 0;
        int right_max = 0;
        int res = 0;

        while(l <= r) {
            // if left column is bigger than right column
            if(height[l] <= height[r]) {
                if(height[l] >= left_max) {
                    left_max = height[l]; // update value of left_max
                }
                else {
                    res = res + (left_max - height[l]);
                }
                l++;
            }

            // if right column is bigger than left column
            else {
                if(height[r] >= right_max) {
                    right_max = height[r]; // update value of right_max
                }
                else {
                    res = res + (right_max - height[r]);
                }
                r--;
            }
        }
        return res;
    }
}
