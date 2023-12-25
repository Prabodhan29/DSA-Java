package com.Arrays;

public class SlidingWindow {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 6, -1, 4, 1, 8, 2};
        int k = 5; // window size
        slidingWindow(arr, k);
    }
    public static void slidingWindow(int[] arr, int k){
        int windowSum = 0;
        int maxSum = 0;
        for(int i=0; i<k; i++) {
            windowSum = windowSum + arr[i];
        }
        for(int i=k; i<arr.length; i++) {
            windowSum = windowSum + arr[i] - arr[i - k];
            maxSum = Math.max(windowSum, maxSum);
        }
        System.out.println(maxSum); // 18
    }
}
