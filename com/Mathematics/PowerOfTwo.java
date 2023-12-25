package com.Mathematics;

import java.util.Arrays;
import java.util.HashSet;

public class PowerOfTwo {
    public static void main(String[] args) {
        int n = 12;
        System.out.println(isPowerOfTwo(n));
    }

    // Time complexity = O(n)
    public static boolean isPowerOfTwo(int n) {
        if(n <= 0) return false;

        long x = 1;
        while(x < n) {
            x = x * 2;
        }

        if(x == n) {
            return true;
        }
        return false;
    }

    // Time complexity = O(1)
    public static boolean po2(int n) {
        HashSet<Integer> hs = new HashSet<>(Arrays.asList(1, 2, 4, 8, 16, 32,
                                            64, 128, 256, 512, 1024, 2048,
                                            4096, 8192, 16384, 32768, 65536,
                                            131072, 262144, 524288, 1048576,
                                            2097152, 4194304, 8388608,16777216,
                                            33554432, 67108864, 134217728, 268435456,
                                            536870912, 1073741824));

        return hs.contains(n);
    }
}
