package com.Mathematics;

import java.util.Arrays;

public class ConstructRectangle {
    public static void main(String[] args) {
        int area = 25;
        System.out.println(Arrays.toString(constructRectangle(area))); // [5, 5]
    }

    public static int[] constructRectangle(int area) {
        int[] res = new int[2];

        int width = (int) Math.sqrt(area);
        while(area % width != 0) {
            width--;
        }

        int length = area / width;

        res[0] = length;
        res[1] = width;
        return res;
    }
}
