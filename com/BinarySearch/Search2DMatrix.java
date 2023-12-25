package com.BinarySearch;

public class Search2DMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 3;
        System.out.println(binarySearch(matrix, target)); // true
    }

    public static boolean binarySearch(int[][] matrix, int target) {
        int rows = matrix.length;
        int columns = matrix[0].length;

        int start = 0;
        int end = (rows * columns) - 1;

        while(start <= end) {
            int mid = start + (end - start)/2;
            int mid_element = matrix[mid / columns][mid % columns];

            if(mid_element == target) return true;
            else if(mid_element < target) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return false;
    }
}
