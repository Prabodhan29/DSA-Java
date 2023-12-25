package com.Arrays;

public class MaximumProductSubarray {
    public static void main(String[] args) {
        int[] nums = {2, 3, -2, 4};
        System.out.println(maxProduct(nums)); // 6
    }

    public static int maxProduct(int[] nums) {
        int current_product = 1;
        int max_product = nums[0];

        // find max_product from left to right
        for(int i=0; i<nums.length; i++) {
            current_product = current_product * nums[i];
            if(current_product > max_product) {
                max_product = current_product;
            }

            if(current_product == 0) {
                current_product = 1;
            }
        }

        // reset current_product to 1
        current_product = 1;

        // find max_product from right to left
        for(int i=nums.length-1; i>=0; i--) {
            current_product = current_product * nums[i];
            if(current_product > max_product) {
                max_product = current_product;
            }

            if(current_product == 0) {
                current_product = 1;
            }
        }

        return max_product;
    }
}
