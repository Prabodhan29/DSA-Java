package com.Arrays;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
        System.out.println(Arrays.toString(productExceptSelf1(nums)));
        // [24, 12, 8, 6]
    }

    public static int[] productExceptSelf(int[] nums) {
        int[] left_product = new int[nums.length];
        int[] right_product = new int[nums.length];
        int[] res = new int[nums.length];

        // first element of left_product
        left_product[0] = 1;

        // last element of right_product
        right_product[nums.length-1] = 1;

        // move left to right
        for(int i=1; i<nums.length; i++) {
            left_product[i] = left_product[i-1] * nums[i-1];
        }

        // move right to left
        for(int i=nums.length-2; i>=0; i--) {
            right_product[i] = right_product[i+1] * nums[i+1];
        }

        // fill the res array by multiplying corresponding element
        // of left_product with right_product.
        for(int i=0; i<nums.length; i++) {
            res[i] = left_product[i] * right_product[i];
        }

        return res;
    }

    public static int[] productExceptSelf1(int[] nums) {
        int[] res = new int[nums.length];

        res[0] = 1;

        for(int i=1; i<nums.length; i++) {
            res[i] = res[i-1] * nums[i-1];
        }

        int right_product = 1;
        for(int i=nums.length-1; i>=0; i--) {
            res[i] = res[i] * right_product;
            right_product = right_product * nums[i];
        }

        return res;
    }
}
