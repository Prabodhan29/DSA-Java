package com.BinarySearch;

public class SquareRoot {
    public static void main(String[] args) {
        int x = 9;
        System.out.println(mySqrt(x)); // 3
        System.out.println(mySqrt(8)); // 2 (floor value of square root of 8
    }

    public static int mySqrt(int x) {
        if(x==0 || x==1) return x;

        int start = 0;
        int end = x;

        while(start < end) {
            int mid = start + (end-start)/2;

            // if(mid*mid == x) // will not work for large integers
            if(mid == x/mid) {
                return mid;
            }
            else if(mid > x/mid) {
                end = mid;
            }
            else {
                start = mid + 1;
            }
        }

        return start - 1;
    }
}
