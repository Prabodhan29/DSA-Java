package com.Arrays;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height)); // 49
    }

    public static int maxArea(int[] height) {
        int start = 0;
        int end = height.length-1;
        int max_area = 0;

        while(start <= end) {
            // we need to take minimum of start and end, otherwise the water will spill.
            // Here minimun is start,
            if(height[start] < height[end]) {

                // end - start -> width
                // height[start] or height[end] -> height of the smallest column
                // so that the water does not spill
                max_area = Math.max(max_area, height[start] * (end-start));
                start++;
            }

            // and here minimum is end.
            else {
                max_area = Math.max(max_area, height[end] * (end-start));
                end--;
            }
        }

        return max_area;
    }
}
