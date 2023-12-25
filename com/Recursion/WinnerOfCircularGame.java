package com.Recursion;

public class WinnerOfCircularGame {
    public static void main(String[] args) {
       System.out.println(findTheWinner(4, 2)); // 1

        int n = 4;
        int k = 2;

        // res can be 0 or 1, the output will still remain the same
        // because we are doing %i in the for loop
        int res = 0;
        for(int i = 1; i <= n; i++) {
            // we don't do %n, instead we do %i
            res = (res + k) % i;
        }

        // convert to 1-based index
        System.out.println(res + 1); // 1
    }

    public static int findTheWinner(int n, int k) {
        // we are adding 1 because the res is coming after %n
        // and modulo operator always returns answers in 0-based index.
        // We need 1-based index, so add 1 to res;
        int res = m1(n, k) + 1;
        return res;
    }

    public static int m1(int n, int k) {
        // base condition
        if(n == 1) {
            // we can also return 0 -> as n-1 = 0
            // because we have 1-based index.
            return n-1;
        }

        // we are doing %n -> say we have 2 friends and the answer comes out 3
        // So we are doing 3%2 which is 1.
        // That is, the ans should always be less than n.
        int ans = (m1(n-1, k) + k) % n;
        return ans;
    }


}
