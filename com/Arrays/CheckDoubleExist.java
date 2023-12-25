package com.Arrays;

import java.util.HashSet;

public class CheckDoubleExist {
    public static void main(String[] args) {
        int[] arr = {10, 2, 5, 3};
        System.out.println(checkIfExist(arr)); // true
    }

    public static boolean checkIfExist(int[] arr) {
        // we can't use integer because for cases like [3, 1] ->
        // (int)3/2 is 1 which is present in arr. Thus it returns true,
        // but true is incorrect.
        // If we use double 3/2 is 1.5 which is not present in the array.
        HashSet<Double> hs = new HashSet<>();
        for(double i : arr) {

            // double means that 5*2 which is 10 should exist in arr
            // or 10/2 which is 5 should exist in arr.
            if(hs.contains(2 * i) || hs.contains(i / 2)) {
                return true;
            }
            else {
                hs.add(i);
            }
        }
        return false;
    }
}
