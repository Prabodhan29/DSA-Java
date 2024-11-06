package com.BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-1,0,3,5,9,12};
        int target = 9;
        System.out.println(binarySearch(arr, target)); // 4
        System.out.println(bs_recursive(arr, target, 0, arr.length-1)); // 4
    }

    private static int binarySearch(int[] arr, int target) {    
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] == target) 
                return mid;
            
            if(arr[mid] > target) 
                end = mid - 1;
                
            else 
                start = mid + 1;
        }
        return -1;
    }

    // Recursive binary search 
    private static int bs_recursive(int[] arr, int target, int start, int end) {
        if(start <= end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] == target) 
                return mid;

            if(arr[mid] > target) 
                return bs_recursive(arr, target, start, mid-1);
            
            else 
                return bs_recursive(arr, target, mid+1, end);
        }
        return -1;
    }
}
