package com.Arrays;

public class LargestAreaInHistogram {
    public static void main(String[] args) {
        int[] heights = {2, 1, 5, 6, 2, 3};
        int res = largestRectangleArea(heights);
        System.out.println(res); // 10
    }
    public static int largestRectangleArea(int[] arr) {
        int res = 0;

        for(int i=0; i<arr.length; i++) {
            int temp_area = 0;
            int left_boundary = i;
            int right_boundary = i;

            // go to all the left heights from i
            while(left_boundary >= 0 && arr[left_boundary] >= arr[i]) {
                left_boundary--;
            }

            // go to all the left heights from i
            while(right_boundary < arr.length && arr[right_boundary] >= arr[i]) {
                right_boundary++;
            }

            temp_area = (right_boundary - left_boundary - 1) * arr[i];
            res = Math.max(temp_area, res);
        }

        return res;
    }
}
