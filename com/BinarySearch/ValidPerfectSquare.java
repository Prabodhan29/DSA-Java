package com.BinarySearch;

public class ValidPerfectSquare {
    public static void main(String[] args) {
        int num = 16;
        System.out.println(isPerfectSquare(num)); // true
    }

    public static boolean isPerfectSquare(int num) {
        if(num == 0) return true;

        if(num == 1) return true;

        // we are using long and not int
        // as the number can be more than the limit of integers
        long start = 0;
        long end = num/2;

        while(start<=end) {
            long mid = start+(end-start)/2;
            long square = mid*mid;
            if(square == num) {
                return true;
            }
            else if(square < num) {
                start = mid+1;
            }
            else {
                end=mid-1;
            }
        }
        return false;
    }
}
