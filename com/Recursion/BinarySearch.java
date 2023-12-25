package com.Recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 55, 67, 68, 72, 96};
        int target = 235;
        System.out.println(BSWithRecursion(arr, target, 0, arr.length-1)); // 3
    }

    public static int BSWithRecursion(int[] arr, int target, int start, int end) {
        // base condition
        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;

        if (arr[mid] == target) {
            return mid;
        }
        else if (arr[mid] < target) {
            return BSWithRecursion(arr, target, mid+1, end);
        }
        else {
            return BSWithRecursion(arr, target, start, mid-1);
        }
    }
}
