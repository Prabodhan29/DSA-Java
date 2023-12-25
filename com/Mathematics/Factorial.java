package com.Mathematics;

import java.math.BigInteger;

public class Factorial {
    public static void main(String[] args) {
        int num = 35;
        System.out.println(factorial1(num)); // 0 -> (Iterative approach), but for small integers
        System.out.println(factorial2(num)); // 0 -> (Reversive approach), but for small integers
        System.out.println(factorial3(num)); // 10333147966386144929666651337523200000000 -> For big intergers
    }

    // Iterative approach
    public static int factorial1(int n) {
        int res = 1;
        if(n == 0) return res;
        if(n < 0) return 0;

        for(int i=1; i<=n; i++) {
            res = res * i;
        }
        return res;
    }

    // recursive approach
    public static int factorial2(int n) {
        int res = 1;
        // base condition
        if(n == 0) return res;
        if(n < 0) return 0;

        res = n * factorial2(n-1);
        return res;
    }

    // for big intergers
    public static BigInteger factorial3(int n) {
        BigInteger RES = BigInteger.ONE;
        if(n == 0) return RES;
        if(n < 0) return BigInteger.ZERO;

        for(int i=1; i<=n; i++) {
            RES = RES.multiply(BigInteger.valueOf(i));
        }

        return RES;
    }
}
