package com.Mathematics;

public class FactorialTrailingZeros {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(trailingZeroes(n)); // 1
    }

    public static int trailingZeroes(int n) {
        if (n <= 4) return 0;

        int res = 0;
        for (int i = 5; i <= n; i = i * 5) {
            res = res + (n / i);
        }
        return res;
    }
}
