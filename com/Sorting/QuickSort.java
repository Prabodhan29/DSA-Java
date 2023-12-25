package com.Sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {4, 6, 2, 5, 9, 1, 3};
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr)); // [1, 2, 3, 4, 5, 6, 9]
    }

    public static void quickSort(int[] arr, int start, int end) {
        // base condition
        if(start >= end) {
            return;
        }

        // the pivot element is always placed at correct index because of partition().
        int pivot = partition(arr, start, end);
        quickSort(arr, start, pivot - 1);
        quickSort(arr, pivot + 1, end);
    }

    public static int partition(int[] arr, int start, int end) {
        // taking first element as pivot
        int pivot = arr[start];

        // counting for how elements are less than pivot
        int count = 0;
        for(int i = start + 1; i <= end; i++) { // start+1 as pivot is start
            if(arr[i] <= pivot) {
                count++;
            }
        }
        // pivot should be at an index where all the elements on its left are less than pivot.
        // That is, the correct position of pivot is at index -
        // start (pivot) + count(how many elements are less than pivot).
        int pivot_correct_index = start + count;

        // swap the pivot which was start index to the actual correct index
        // such that all elements on left are less than pivot.
        swap(arr, start, pivot_correct_index);

        int i = start;
        int j = end;
        while(i < pivot_correct_index && j > pivot_correct_index) {
            // skip elements which are less than pivot (on the left side)
            while(arr[i] <= pivot) {
                i++;
            }
            // skip elements which are more than pivot (on the right side)
            while(arr[j] > pivot) {
                j--;
            }

            // this if statement is going to execute only when an element (at left side)
            // is more than pivot. Because for less than pivot, we are skipping that element
            // using the first while loop. Similar for the right side.
            // Thus, swap the ith element with jth element -> as ith element is more than pivot
            // which should be present at right side and vice-versa.
            // and move ahead (no need to check for the recently swapped element -> as we
            // were doing that check in cycle sort with the else statement. Here, recursion will
            // take care of the recently swapped elements.
            if(i < pivot_correct_index && j > pivot_correct_index) {
                swap(arr, i, j);
                i++;
                j--;
            }
        }

        // return the correct index where the pivot element should be present.
        return pivot_correct_index;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
