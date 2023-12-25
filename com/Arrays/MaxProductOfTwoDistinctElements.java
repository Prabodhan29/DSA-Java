package com.Arrays;

public class MaxProductOfTwoDistinctElements {
    public static void main(String[] args) {
        int[] nums = {1, 4, 3, 5, 3, 5};
        System.out.println(maxProduct(nums)); // 25
    }

    public static int maxProduct(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int second_largest = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++) {
            if(arr[i] > largest) {
                second_largest = largest;
                largest = arr[i];
            }

            // because we can have same element with differnt indices.
            else if(arr[i] > second_largest) {
                second_largest = arr[i];
            }
        }
        return largest * second_largest;
    }
}
