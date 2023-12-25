package com.Mathematics;

import java.util.Arrays;

public class SieveOfEratosthenes {
    public static void main(String[] args) {
        int n = 5;

        boolean[] isPrime = sieveofErathsthenes(n);
        for (int i = 0; i <= n; i++) {
            System.out.println(i + " " + isPrime[i]);
        }
    }

    public static boolean[] sieveofErathsthenes(int n) {
        boolean[] isPrime = new boolean[n + 1];

        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            for (int j = 2 * i; j <= n; j = j + i) {
                isPrime[j] = false;
            }
        }

        return isPrime;
    }
}

// Output -
// 0 false
// 1 false
// 2 true
// 3 true
// 4 false
// 5 true