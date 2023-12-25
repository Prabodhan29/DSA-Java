package com.Recursion;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 4, 2};

        int start = 0;
        int end = arr.length - 1;

        int[] x1 = reverseArray(arr, start, end);
        System.out.println(Arrays.toString(x1)); // [2, 4, 2, 3, 1]
    }

    public static int[] reverseArray(int[] arr, int start, int end) {
        // base condition
        if(start >= end) return arr;

        // swap
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        return reverseArray(arr, start+1, end-1);
    }

    public static int[] reverseArray(int[] arr, int start) {
        int end = arr.length - 1 - start;
        // base condition
        if(start >= end) return arr;

        // swap
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        return reverseArray(arr, start+1);
    }
}
