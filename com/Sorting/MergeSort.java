package com.Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 4, 8, 19, 10, 16};
        int[] sorted_arr = mergeSort(arr);

        // the original array is not modified
        System.out.println(Arrays.toString(arr)); // [1, 3, 2, 4, 8, 19, 10, 16]
        System.out.println(Arrays.toString(sorted_arr)); // [1, 2, 3, 4, 8, 10, 16, 19]
    }

    // divide
    public static int[] mergeSort(int[] arr) {
        // base case
        // the base condition will only return the sorted array
        // once the entire function call stack becomes empty
        if(arr.length == 1) return arr;

        int mid = arr.length/2;
        int[] left_arr = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right_arr = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left_arr, right_arr); // returns combine
    }

    // conquer
    public static int[] merge(int[] first, int[] second) {
        int[] combine = new int[first.length + second.length];
        int i = 0, j = 0, k = 0;

        while(i<first.length && j<second.length) {
            if(first[i] < second[j]) {
                combine[k] = first[i];
                i++; k++;
            }
            else {
                combine[k] = second[j];
                j++; k++;
            }
        }

        // if first array has more elements than second array
        // then add all the remaining elements of first array
        // into combine array
        while(i<first.length) {
            combine[k] = first[i];
            i++; k++;
        }

        // if second array has more elements than first array
        // then add all the remaining elements of second array
        // into combine array
        while(j<second.length) {
            combine[k] = second[j];
            j++; k++;
        }
        return combine;
    }
}
