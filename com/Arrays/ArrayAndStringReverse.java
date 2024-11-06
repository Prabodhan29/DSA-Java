package com.Arrays;

import java.util.Arrays;

public class ArrayAndStringReverse {
    static public void main(String[] pro) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(reverseArray(arr)));
        // [5, 4, 3, 2, 1]
    }
    public static int[] reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while(start <= end) {
            // swap
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }
}
