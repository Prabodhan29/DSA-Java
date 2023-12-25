package com.Sorting;

import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        cycle(arr);
        System.out.println(Arrays.toString(arr)); // [1, 2, 3, 4, 3, 2, 7, 8]
    }

    public static int[] cycle(int[] arr) {
        int i = 0;
        while(i<arr.length) {
            int correct_position = arr[i]-1;
            if(arr[i] != arr[correct_position]) {
                swap(arr, i, correct_position);
            }
            else {
                i++;
            }
        }
        return arr;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
