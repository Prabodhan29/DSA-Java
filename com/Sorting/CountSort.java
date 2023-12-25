package com.Sorting;

import java.util.Arrays;

public class CountSort {
    public static void main(String[] args) {
        int[] arr = {3, 4, 1, 3, 2, 5, 2};
        System.out.println(Arrays.toString(sort(arr))); // [1, 2, 2, 3, 3, 4, 5]
        Arrays.sort(arr);
    }

    public static int[] sort(int[] arr) {
        int largest_number = arr[0];
        for(int element : arr) {
            if(element > largest_number)
                largest_number = element;
        }

        int[] frequency_arr = new int[largest_number + 1];

        // fill the frequency_arr with zero
        for(int ele : frequency_arr) {
            ele = 0;
        }

        // store the count of each element at its respective index number
        for(int i=0; i<arr.length; i++) {
            frequency_arr[arr[i]]++;
        }

        int temp_index = 0; // for arr traversal
        for(int i=0; i<frequency_arr.length; i++) {
            while(frequency_arr[i] > 0) { // see Image 1
                arr[temp_index] = i;
                frequency_arr[i]--; // decrease the frequency
                temp_index++;
            }
        }

        return arr;
    }
}
