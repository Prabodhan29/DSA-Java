package com.Recursion;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 6;
        //System.out.println(fibonacci1(n)); // 8
        System.out.print(fib(n)); // 8
    }

    // Recursive approach - not optimal at all
    public static long fibonacci1(int n) {
        // Base case
        if(n <= 1) {
            return n;
        }

        // f(n) = f(n-1) + f(n-2)
        // f(n) = last + second_last
        long last = fibonacci1(n-1);
        long second_last = fibonacci1(n-2);
        return last + second_last;
    }

    // Optimal approach - O(n) complexity
    public static int fib(int n) {
        if(n<=1) return n;

        int a = 0;
        int b = 1;
        int sum = a + b;

        while(n > 1) {
            sum = a + b;
            a = b;
            b = sum;
            n--;
        }

        return sum;
    }
}
