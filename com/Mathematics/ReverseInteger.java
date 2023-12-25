package com.Mathematics;

public class ReverseInteger {
    public static void main(String[] args) {
        int x = 3452;
        System.out.println(reverse(x)); // 2543
    }

    public static int reverse(int x) {
        double rev = 0;

        while(x != 0) {
            rev = (rev*10) + (x%10);
            x = x/10;

            if(rev>Integer.MAX_VALUE || rev<Integer.MIN_VALUE) {
                return 0;
            }
        }

        return (int) rev;
    }
}
