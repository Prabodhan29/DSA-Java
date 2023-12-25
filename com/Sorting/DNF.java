package com.Sorting;

import java.util.Arrays;

public class DNF {
    public static void main(String[] args) {
        int[] arr = {2,0,2,1,1,0};
        DNF(arr);
        System.out.println(Arrays.toString(arr)); // [0, 0, 1, 1, 2, 2]
    }

    public static void DNF(int[] arr) {
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;

        while(mid <= high) {
            if(arr[mid] == 0) {
                swap(arr, mid, low); // move both low and mid pointer
                mid++;
                low++;
            }
            else if(arr[mid] == 1) {
                mid++; // move only the mid pointer
            }
            else if(arr[mid] == 2) {
                swap(arr, mid, high); // don't move the mid pointer here
                high--;
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
