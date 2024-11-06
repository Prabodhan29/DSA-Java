package com.Arrays;

import java.util.Arrays;

public class KthSmallestLargestElement {
    public static void main(String[] args) {
        int[] arr = {-7, 10, 4, 3, 20, 15};
        int k = 3;
        kthSmallestElement(arr, k); // 4
        kthLargestElement(arr, k); // 10
    }

    public static void kthSmallestElement(int[] arr, int k) {
        Arrays.sort(arr);
        System.out.println(arr[k-1]);
    }

    public static void kthLargestElement(int[] arr, int k){
        Arrays.sort(arr);
        System.out.println(arr[arr.length-k]);
    }
}
