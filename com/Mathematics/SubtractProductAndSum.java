package com.Mathematics;

public class SubtractProductAndSum {
    public static void main(String[] args) {
        int n = 234;
        System.out.println(subtractProductAndSum(n)); // 15
        System.out.println(subtractProductAndSumRecursive(n)); // 15
    }

    // Iterative approach
    public static int subtractProductAndSum(int n) {
        int sum=0;
        int product = 1;

        while(n > 0) {
            sum = sum + (n%10);
            product = product * (n%10);
            n=n/10;
        }

        return product - sum;
    }

    // Recursive approach
    public static int subtractProductAndSumRecursive(int n) {
        int sum = sum(n);
        int product = product(n);

        return product - sum;
    }

    public static int sum(int n) {
        // base case
        if(n == 0) return n;

        return (n%10) + sum(n/10);
    }
    public static int product(int n) {
        // base case
        if(n%10 == n) return n;

        return (n%10) * product(n/10);
    }
}
