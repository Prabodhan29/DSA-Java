package com.Recursion;

public class AddDigits {
    public static void main(String[] args) {
        int num = 199;
        System.out.println(addDigits(num)); // 1
    }

    public static int addDigits(int num) {
        int x = sum(num);
        return x;
    }
    public static int sum(int n) {
        // base case 1
        if(n==0) {
            return n;
        }

        int res = 0;
        res = (n%10) + sum(n/10);

        // base case 2
        if(res <= 9) {
            return res;
        }

        if(res >= 10) {
            res = sum(res);
        }

        return res;
    }
}
