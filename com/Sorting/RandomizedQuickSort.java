package com.Sorting;

import java.util.Arrays;
import java.util.Random;

public class RandomizedQuickSort {
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

        int pivot = partition(arr, start, end);
        quickSort(arr, start, pivot - 1);
        quickSort(arr, pivot + 1, end);
    }

    public static int partition(int[] arr, int start, int end) {
        // the pivot is chosen at random
        random(arr, start, end);
        int pivot = arr[start];
        System.out.println("The pivot is: " + pivot); // different pivot each time

        int count = 0;
        for(int i = start + 1; i <= end; i++) {
            if(arr[i] <= pivot) {
                count++;
            }
        }
        int pivot_correct_index = start + count;

        swap(arr, start, pivot_correct_index);

        int i = start;
        int j = end;
        while(i < pivot_correct_index && j > pivot_correct_index) {
            while(arr[i] <= pivot) {
                i++;
            }
            while(arr[j] > pivot) {
                j--;
            }

            if(i < pivot_correct_index && j > pivot_correct_index) {
                swap(arr, i, j);
                i++;
                j--;
            }
        }

        return pivot_correct_index;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    private static void random(int[] arr, int start, int end) {
        Random rand = new Random();
        int pivot = rand.nextInt(end - start) + start;
        swap(arr, pivot, start);
    }
}
