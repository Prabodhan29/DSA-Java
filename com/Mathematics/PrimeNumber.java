package com.Mathematics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimeNumber {
    public static void main(String[] args) {
        int num = 100;
        System.out.println(printPrimes(num));
        // [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97]

        int[] arr = sieveOfEratosthenes(num);
        List<Integer> res = new ArrayList<>(arr.length);
        for(int i=2; i<arr.length; i++) {
            if(arr[i] == 1) res.add(i);
        }
        System.out.println(res);
        // [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97]
    }

    public static List<Integer> printPrimes(int n) {
        List<Integer> res = new ArrayList<>(n);
        for(int i=2; i<=n; i++) {
            if(isPrime(i)) res.add(i);
        }
        return res;
    }

    public static boolean isPrime(int num) {
        if(num <= 1) return false;
        for(int i=2; i<=Math.sqrt(num); i++) {
            if(num % i == 0) return false; // num is divisible by i, return false
        }
        return true;
    }

    public static int[] sieveOfEratosthenes(int n) {
        int[] arr = new int[n+1]; // to include n also
        if(n <= 1) return arr;

        //! 1 = true and 0 = false
        Arrays.fill(arr, 1); // initially assume the entire array is prime

        for(int i=2; i<Math.sqrt(n); i++) {
            for(int j=2*i; j<=n; j=i+j) { // if i = 3, then start from 3*2 = 6 and go to 9, then 12 or 3 + j
                arr[j] = 0;
            }
        }
        return arr;
    }
}
