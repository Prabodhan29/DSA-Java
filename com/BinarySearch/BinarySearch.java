package com.BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-1,0,3,5,9,12};
        int[] rev_arr = {12,9,5,3,0,-1};
        int target = 9;
        System.out.println(binarySearch(arr, target)); // 4
        System.out.println(binarySearch(rev_arr, target)); // 1
    }

    private static int binarySearch(int[] arr, int target) {
        boolean isAscending;
        isAscending = arr[0] < arr[arr.length - 1];

        int start = 0;
        int end = arr.length-1;

        while(start <= end) {
            int mid = start + (end-start)/2;
            if(arr[mid] == target) {
                return mid;
            }
            else {
                if(isAscending) {
                    if(arr[mid] < target) {
                        start = mid + 1;
                    }
                    else {
                        end = mid - 1;
                    }
                }
                else {
                    if(arr[mid] < target) {
                        end = mid - 1;
                    }
                    else {
                        start = mid + 1;
                    }
                }
            }
        }
        return -1;
    }
}
