package com.Arrays;

import java.util.Arrays;

public class PrefixSumArray {
    public static void main(String[] args) {
        int[] arr = { 10, 4, 16, 20 };
        System.out.println(Arrays.toString(prefixSumArray(arr)));
        // [10, 14, 30, 50]
    }
    public static int[] prefixSumArray(int[] arr) {
        int[] prefixSum = new int[arr.length];

        // because the first element is going to be same in both the arrays.
        prefixSum[0] = arr[0];

        for(int i = 1; i < arr.length; i++) {
            prefixSum[i] = arr[i] + prefixSum[i-1];
        }
        return prefixSum;
    }
}
