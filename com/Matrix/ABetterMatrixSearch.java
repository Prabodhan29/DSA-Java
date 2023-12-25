package com.Matrix;

public class ABetterMatrixSearch {
    public static void main(String[] args) {
        int[][] matrix = {{3,4,7,9},{12,13,16,18},{20,21,23,29}};
        int target = 29;
        System.out.println(search(matrix, target)); // true
    }

    public static boolean search(int[][] matrix, int target) {
        boolean res = false;
        for(int row=0; row<matrix.length; row++) {
            // target exists in this row
            if(matrix[row][0] <= target  && matrix[row][matrix[row].length-1] >= target)
                res = binarySearch(matrix[row], target);
        }
        return res;
    }

    public static boolean binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] == target) return true;
            else if(arr[mid] <target) start = mid + 1;
            else end = mid - 1;
        }
        return false;
    }
}
