package com.Matrix;

public class FlipAnImage {
    public static void main(String[] args) {
        int[][] image = {{1,1,0},{1,0,1},{0,0,0}};
        flipAndInvertImage(image); // [[1,0,0],[0,1,0],[1,1,1]]
    }

    public static void flipAndInvertImage(int[][] image) {
        // reverse each row
        for(int[] arr : image) {
            int start = 0;
            int end = arr.length - 1;
            swap(arr, start, end);
        }

        // change 0 -> 1 and 1 -> 0
        for(int i=0; i<image.length; i++) {
            for(int j=0; j<image[i].length; j++) {
                if(image[i][j] == 1) {
                    image[i][j] = 0;
                }
                else {
                    image[i][j] = 1;
                }
            }
        }
    }

    public static void swap(int[] nums, int start, int end) {
        while(start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
