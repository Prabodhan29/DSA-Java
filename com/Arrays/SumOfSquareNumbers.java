package com.Arrays;

public class SumOfSquareNumbers {
    public static void main(String[] args) {
        int c = 5;
        System.out.println(judgeSquareSum(c)); // true
    }

    public static boolean judgeSquareSum(int c) {
        long start = 0;
        long end = (long) Math.sqrt(c);

        while(start <= end) {
            long target = (start * start) + (end * end);

            if(target == c) return true;

            else if(target < c) start++;

            else end--;
        }
        return false;
    }
}
